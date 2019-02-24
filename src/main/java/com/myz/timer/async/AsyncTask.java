/**
 * Copyright 2018 asiainfo Inc.
 **/
package com.myz.timer.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 异步任务
 *
 * @author maoyz on 2018/8/8
 * @version: v1.0
 */
@Component
public class AsyncTask {

    /**
     * 无返回值
     */
    @Async
    public void task1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("执行无返回值异步任务");
    }

    /**
     * 有返回值
     *
     * @param i
     * @return
     */
    @Async
    public Future<String> task2(int i) {
        Future future = null;
        try {
            TimeUnit.SECONDS.sleep(6);
            future = new AsyncResult<String>("success:" + i);
        } catch (InterruptedException e) {
            future = new AsyncResult<String>("error:" + i);
        }
        return future;
    }

}
