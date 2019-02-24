/**
 * Copyright 2018 asiainfo Inc.
 **/
package com.myz.timer.async;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 *
 * @author maoyz on 2018/8/8
 * @version: v1.0
 */
@Component
public class TimerTask {

    /**
     * 基于spring实现的定时任务
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void schedule() {
        System.out.println("执行定时任务");
    }
}
