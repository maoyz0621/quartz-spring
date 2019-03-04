/**
 * Copyright 2018 asiainfo Inc.
 **/
package com.myz.timer.task;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 任务类
 *
 * @author maoyz on 2018/8/7
 * @version: v1.0
 */
@Component
public class FirstTask {

    /**
     * 使用ThreadLocal实现函数式编程
     */
    private static final ThreadLocal<DateFormat> DATE_FORMAT = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS"));

    public void task() {
        System.out.println("执行FirstTask..." + DATE_FORMAT.get().format(new Date()));
    }
}
