package com.infybuzz.app;

import java.util.Map;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({ "com.infybuzz.config", "com.infybuzz.service" })
public class SpringBatchApplication {

	public static void main(String[] args) {
		  String[] fakeArgs = {
            "run=one",
            "time=1"
        };

        SpringApplication.run(SpringBatchApplication.class, fakeArgs);
	}

}
