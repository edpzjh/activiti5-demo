package com.bulain.mybatis.log;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class ThreadAppender extends AppenderSkeleton{
    @Override
    protected void append(LoggingEvent event) {
        String log = getLayout().format(event);
        ThreadContext.add(log);
    }

    @Override
    public void close() {
    }

    @Override
    public boolean requiresLayout() {
        return true;
    }

}
