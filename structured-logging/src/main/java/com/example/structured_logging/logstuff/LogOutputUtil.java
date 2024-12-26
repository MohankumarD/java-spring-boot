package com.example.structured_logging.logstuff;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogOutputUtil implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.trace("Trace log");
        log.debug("Debug error");
        log.info("Info log");
        log.warn("Warning log");
        log.error("Error log");
    }
}
