package com.javacore.concurrent.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadPool implements Executor {

    private AtomicInteger ctl = new AtomicInteger(0);


    private volatile int corePoolSize;

    private volatile int maxPoolSize;

    private final BlockingQueue<Runnable> workQueue;

    public MyThreadPool(int corePoolSize, int maxPoolSize, BlockingQueue<Runnable> workQueue) {
        this.corePoolSize = corePoolSize;
        this.maxPoolSize = maxPoolSize;
        this.workQueue = workQueue;
    }


    public void execute(Runnable command) {
        int c = ctl.get();
        if (c < corePoolSize) {
            //尝试创建线程
            if (!addWorker(command)) {
                reject();
            }
            return;
        }

        //超出了队列长度
        if (!workQueue.offer(command)) {
            //尝试创建线程
            if (!addWorker(command)) {
                reject();
            }
        }
    }

    /**
     * 尝试创建新的线程
     *
     * @param command
     * @return
     */
    private boolean addWorker(Runnable command) {
        if (ctl.get() > maxPoolSize) {
            return false;
        }
        Worker worker = new Worker(command);
        worker.thread.start();
        ctl.incrementAndGet();
        return true;
    }

    private Runnable getTask() {
        for (; ; ) {
            try {
                System.out.println("workQueue.size：" + workQueue.size());
                return workQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void reject() {
        throw new RuntimeException("Error！ctl.count：" + ctl.get() + " workQueue.size：" + workQueue.size());
    }

    private final class Worker implements Runnable {
        final Thread thread;
        Runnable firstTask;

        public Worker(Runnable command) {
            this.thread = new Thread(this);
            this.firstTask = command;
        }

        public void run() {
            Runnable task = this.firstTask;
            try {
                while (task != null || (task = getTask()) != null) {
                    task.run();
                    if (ctl.get() > maxPoolSize) {
                        break;
                    }
                    task = null;
                }
            } finally {
                ctl.decrementAndGet();
            }
        }


    }

}
