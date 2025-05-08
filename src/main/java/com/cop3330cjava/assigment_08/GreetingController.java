// The package declaration indicates where this file is located in the project.
package com.cop3330cjava.assigment_08;

/*
 * Name: Minh-Ngoc Tran
 * Course: 202520-COP-3330C
 * Project 8 - Web Apps
 * Date: April 10 - 2025
 * Part_ 02
 *
* This file defines a GreetingController class in a Spring MVC application. It handles GET and POST requests for the /greeting URL.
* The GET method displays a form with a new Greeting object, while the POST method processes the form submission.
* It validates the provided date, and if valid, shows the results on a separate page.
*  If the date is invalid, an error message is displayed.
* The class also includes a helper method for simple date validation.
*/

// Importing necessary Spring classes for controller functionality.
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

// This annotation marks the class as a Spring MVC controller.
@Controller
public class GreetingController {
    // List to store all greeting submissions during the app session
    private final List<Greeting> submissions = new ArrayList<>();

    // Handles GET requests to the "/greeting" URL.
    @GetMapping("/greeting")
    public String showForm(Model model) {
        // Adds a new Greeting object to the model, so it can be accessed in the view.
        model.addAttribute("greeting", new Greeting());

        // Returns the "greeting" view, which typically maps to a template file (e.g., greeting.html).
        return "greeting";
    }

    // Handles POST requests to the "/greeting" URL.
    @PostMapping("/greeting")
    public String submitForm(@ModelAttribute Greeting greeting, Model model) {
        // Validates the provided date (month, day, year).
        if (!isValidDate(greeting.getMonth(), greeting.getDay(), greeting.getYear())) {
            // If the date is invalid, adds an error message to the model and returns to the "greeting" view.
            model.addAttribute("error", "Invalid date. Please try again.");
            return "greeting";
        }

        // Add this greeting to the list of all submissions
        submissions.add(greeting);


        // If the date is valid, adds the greeting object to the model for use in the "result" view.
        model.addAttribute("greeting", greeting);
        model.addAttribute("submissions", submissions);

        // Returns the "result" view, which will display the form data after submission.
        return "result";
    }

    // Helper method to validate if the date is valid.
    private boolean isValidDate(int month, int day, int year) {
        // Checks if the month is within valid range (1 to 12).
        if (month < 1 || month > 12) return false;

        // Checks if the day is within valid range (1 to 31).
        if (day < 1 || day > 31) return false;

        // Checks if the year is within a reasonable range (1900 to 2100).
        if (year < 1900 || year > 2100) return false;

        // If all checks pass, the date is considered valid.
        return true;
    }
}
