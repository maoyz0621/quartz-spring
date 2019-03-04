/**
 * Copyright 2018 asiainfo Inc.
 **/
package com.myz.timer.job;

import org.quartz.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author maoyz on 2018/8/5
 * @version: v1.0
 */
public abstract class BaseJob implements Job {

    protected final String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(System.currentTimeMillis());

    protected final Logger logger = LoggerFactory.getLogger(getClass());
}
