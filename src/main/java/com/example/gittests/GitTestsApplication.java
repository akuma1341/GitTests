package com.example.gittests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestsApplication.class, args);

        HelloWorld.hello();
    }

}
