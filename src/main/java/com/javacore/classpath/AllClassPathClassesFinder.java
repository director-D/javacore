package com.javacore.classpath;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/8/15 16:05
 * @Version: 1.0
 * @Description:
 */
public class AllClassPathClassesFinder {


    public static Set<String> walkAllClass() throws IOException, URISyntaxException {


        List<URL> urls = obtainAllUrls();
        Set<String> allClasses = doWalkAllClass(urls);
        return allClasses;

    }

    public static Set<String> doWalkAllClass(List<URL> urls) throws URISyntaxException, IOException {
        Set<String> classes = new HashSet<>();
        for (URL url : urls) {
            if (url.toURI().getScheme().equals("file")) {
                File file = new File(url.toURI());
                if (!file.exists()) continue;
                if (file.isDirectory()) {
                    Files.walkFileTree(file.toPath(), new SimpleFileVisitor<Path>() {
                        @Override
                        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                            if (path.toFile().getName().endsWith(".class")) {
                                String substring = path.toFile().getAbsolutePath().substring(file.getAbsolutePath().length());
                                if (substring.startsWith(File.separator)) {
                                    substring = substring.substring(1);
                                }
                                substring = substring.substring(0, substring.length() - 6);
                                classes.add(substring.replace(File.separator, "."));
                            }
                            return super.visitFile(path, attrs);
                        }
                    });
                } else if (file.getName().endsWith(".jar")) {
                    JarFile jarFile = new JarFile(file);
                    Enumeration<JarEntry> entries = jarFile.entries();
                    while (entries.hasMoreElements()) {
                        JarEntry jarEntry = entries.nextElement();
                        if (!jarEntry.getName().endsWith(".class")) continue;
                        String replace = jarEntry.getName().replace("/", ".");
                        replace = replace.substring(0, replace.length() - 6);
                        classes.add(replace);
                    }
                }
            }
        }
        return classes;
    }

    public static List<URL> obtainAllUrls() throws MalformedURLException {
        List<URL> urls = new ArrayList<>();
        if (AllClassPathClassesFinder.class.getClassLoader() instanceof URLClassLoader) {
            Collections.addAll(urls, ((URLClassLoader) AllClassPathClassesFinder.class.getClassLoader()).getURLs());
        } else {
            for (String s : System.getProperty("java.class.path").split(";")) {
                urls.add(new File(s).toURI().toURL());
            }
        }
        return urls;
    }


    public static void main(String[] args) throws IOException, URISyntaxException {
        walkAllClass().forEach(System.out::println);
    }

}
