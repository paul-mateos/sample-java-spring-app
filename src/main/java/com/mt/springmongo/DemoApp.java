package com.mt.springmongo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main Application controller.
 *
 * @author Mithun 
 */
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.mt.*")
public class DemoApp {

    private static final Logger LOGGER = LogManager.getLogger(DemoApp.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);

        LOGGER.info("Info level log message");
	    LOGGER.debug("Debug level log message");
	    LOGGER.error("Error level log message");
    }

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
