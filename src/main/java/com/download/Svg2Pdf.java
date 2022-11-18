package com.download;

import de.vandermeer.svg2vector.applications.is.Svg2Vector_IS;
import org.apache.commons.lang3.ArrayUtils;

import static org.junit.Assert.assertEquals;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/11/13 00:30
 * @Version: 1.0
 * @Description:
 */
public class Svg2Pdf {


    /** Prefix for tests that create output. */
    static String OUT_DIR_PREFIX = "src/";

    /** Prefix for tests that create output. */
    static String FAKE_EXEC = OUT_DIR_PREFIX + "fake-is-exec";

    /** Standard CLI options for tests. */
    static String[] STD_OPTIONS_1 = new String[]{
            "--create-directories", "--overwrite-existing", "--all-layers", "-q",
            "-x", FAKE_EXEC,
//			"-x", "C:/Program Files/Inkscape/inkscape.exe",
            "--simulate"
    };

    /** Standard CLI options for tests. */
    static String[] STD_OPTIONS = ArrayUtils.addAll(STD_OPTIONS_1,
            "-t", "pdf"
    );


    public static void main(String[] args) {

        Svg2Vector_IS app = new Svg2Vector_IS();
        String[] newArgs = ArrayUtils.addAll(STD_OPTIONS,
                "-f", "pdftext.svg",
                "-d", OUT_DIR_PREFIX,
                "-o", "chomsky1"
        );
        app.executeApplication(newArgs);

    }


}
