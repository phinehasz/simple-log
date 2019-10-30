package com.simple.log.simplelog;

import com.simple.log.simplelog.util.LogUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author srh
 * @date 2019/10/30
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class LogUtilsTest {

    private static Logger logger = LoggerFactory.getLogger(LogUtilsTest.class);

    @Test
    public void logTest() {
        LogUtils.logFormatInfo(null, "this is logUtils info msg", "");
        LogUtils.logFormatError(null, "this is logUtils error msg", "");
        logger.info("this is LogUtilsTest info msg");
        logger.error("this is LogUtilsTest error msg");
    }

}
