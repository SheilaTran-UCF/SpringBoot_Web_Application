package com.cop3330cjava.assigment_08;

/*
 * Name: Minh-Ngoc Tran
 * Course: 202520-COP-3330C
 * Project 8 - Web Apps
 * Date: April 10 - 2025
 * Part_ 02
 *
 * Objective:
 *   This project creates a Spring Boot web application with mavern & Tomcat that accepts user input
 *   through a form, validates the data, and displays it back to the user.
 *
 * Inputs:
 *   - Student ID (String)
 *   - Date (month, day, year)
 *   - Message (String)
 *
 * Outputs:
 *   - Formatted results of user input displayed on a results page.
 */


// This line imports the SpringApplication class, which is used to bootstrap and launch a Spring application.
import org.springframework.boot.SpringApplication;
// This line imports the SpringBootApplication annotation, which marks this class as a Spring Boot application.
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation tells Spring Boot that this is the main class for configuration, and to enable auto-configuration and component scanning.
@SpringBootApplication
public class Assigment08Application {

    // This is the main method. It is the entry point of the Java application.
    public static void main(String[] args) {

        // This line launches the Spring Boot application by calling run(), passing in this class and the command-line arguments.
        SpringApplication.run(Assigment08Application.class, args);
    }

}
