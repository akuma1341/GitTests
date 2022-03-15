package com.example.gittests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GitTestsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(GitTestsApplication.class, args);

        Speaker speaker = context.getBean(Speaker.class);
        speaker.speak();
    }

}
