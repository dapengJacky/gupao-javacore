package com.gupao.concurrent_thread.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2019/11/28-17:28
 */
public class ThreadPoolDemo implements Runnable{

    public static void main(String[] args) {

        ThreadPoolExecutor executorService=(ThreadPoolExecutor) ExecutorsSelf.newFixedThreadPool(3);
        executorService.prestartAllCoreThreads(); //可以提前预热所有核心线程
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ThreadPoolDemo());
        }
        executorService.shutdown();
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
