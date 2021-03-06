package com.gupao.concurrent_thread.thread_pool;

import java.util.concurrent.*;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2019/11/28-18:20
 */
public class ExecutorsSelf {

    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolSelf(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(90), (r, executor) -> System.out.println(r.toString()+"executor"+executor.toString()+"is discard"));
    }
}
