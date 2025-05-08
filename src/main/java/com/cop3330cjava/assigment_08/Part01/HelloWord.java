// Define the package where this Java class is located
package com.cop3330cjava.assigment_08.Part01;


/*
 * Name: Minh-Ngoc Tran
 * Course: 202520-COP-3330C
 * Project 8 - Web Apps
 * Date: April 10 - 2025
 * Part_ 01
 *
This Java file is a simple Spring Boot application that starts a local web server and displays a centered, red-colored “Hello World!” message on a webpage.
It uses annotations from the Spring Boot framework to handle HTTP requests and serve HTML content.
 */
// Import Spring Boot core classes
import org.springframework.boot.*; // Contains SpringApplication and other core classes
import org.springframework.boot.autoconfigure.*; // Enables Spring Boot auto-configuration
import org.springframework.web.bind.annotation.*; // Allows use of REST annotations like @RestController and @RequestMapping

// This annotation tells Spring Boot that this class will handle web requests and return data (usually JSON or HTML)
@RestController

// Enables Spring Boot’s auto-configuration feature to automatically set up the application based on the dependencies
@EnableAutoConfiguration

// Main class for your Spring Boot application
public class HelloWord {

    // This method handles GET requests to the root URL "/"
    @RequestMapping("/")
    String home() {
        // Returns a block of HTML code as a string. The page has a red "Hello World!" message centered on the screen.
        return """
                <html>
                <head><title>Hello</title></head> <!-- Web page title -->
                <body style='display: flex; justify-content: center; align-items: center; height: 100vh; background-color: #f5f5f5;'> <!-- Centering and background -->
                    <h1 style='color: red;'>Hello World!</h1> <!-- Red heading -->
                </body>
                </html>
                """;
    }

    // The main method is the entry point of the Java application
    public static void main(String[] args) {
        // This line launches the Spring Boot application
        SpringApplication.run(HelloWord.class, args);
    }
}
