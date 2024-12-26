package com.example.structured_logging.logstuff;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.boot.logging.structured.StructuredLogFormatter;

public class KeyVauleLogger implements StructuredLogFormatter<ILoggingEvent> {
    @Override
    public String format(ILoggingEvent event) {
        return "level= " + event.getLevel() + ", message= " + event.getFormattedMessage();
    }
}
