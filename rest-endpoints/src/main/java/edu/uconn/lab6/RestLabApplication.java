package edu.uconn.lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestLabApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestLabApplication.class, args);
        System.out.println("Server running on http://localhost:8080");
    }
}
