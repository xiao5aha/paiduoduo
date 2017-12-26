package com.paiduoduo.pai.constant;

import org.apache.log4j.Logger;

/**
 * Created by donglei
 * Date: 2017/11/16
 * Time: 15:34
 */
public class LogConstant {

    // 运行日志，可以往里面记录所有业务的运行日志
    public static final Logger runLog = Logger.getLogger("run.log");
    public static final Logger debugLog = Logger.getLogger("debug.log");
    public static final Logger processLog = Logger.getLogger("process.log");
}
