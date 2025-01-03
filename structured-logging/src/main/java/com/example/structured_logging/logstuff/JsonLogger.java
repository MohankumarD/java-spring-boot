package com.example.structured_logging.logstuff;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.boot.json.JsonWriter;
import org.springframework.boot.logging.structured.StructuredLogFormatter;

public class JsonLogger implements StructuredLogFormatter<ILoggingEvent> {

    private final JsonWriter<ILoggingEvent> writer = JsonWriter.<ILoggingEvent>of((members) -> {
        members.add("Level", ILoggingEvent::getLevel);
        members.add("Message", ILoggingEvent::getFormattedMessage);
        members.add("timestamp", ILoggingEvent::getTimeStamp);
        members.add("application").usingMembers((application) -> {
            application.add("name", "StructuredLoggingDemo");
            application.add("version", "1.0.0-SNAPSHOT");
        });
        members.add("node").usingMembers((node) -> {
            node.add("hostname", "node-1");
            node.add("ip", "10.0.0.7");
        });
    }).withNewLineAtEnd();

    @Override
    public String format(ILoggingEvent event) {
        return this.writer.writeToString(event);
    }
}
