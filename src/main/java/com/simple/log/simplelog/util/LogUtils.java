package com.simple.log.simplelog.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author srh
 * @date 2019/10/30
 **/
public class LogUtils {

    private static final Logger BIZ_LOG = LoggerFactory.getLogger("simple-log-biz");
    private static final Logger ERROR_LOG = LoggerFactory.getLogger("simple-log-error");

    private LogUtils() {
    }

    public static void logFormatInfo(Throwable e, String format, Object... args) {
        BIZ_LOG.info(String.format(format, args), e);
    }

    public static void logFormatError(Throwable e, String format, Object... args) {
        ERROR_LOG.error(String.format(format, args), e);
    }
}
