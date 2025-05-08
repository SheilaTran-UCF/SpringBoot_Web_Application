// Defines the package where this class is located.
package com.cop3330cjava.assigment_08;

/*
 * Name: Minh-Ngoc Tran
 * Course: 202520-COP-3330C
 * Project 8 - Web Apps
 * Date: April 10 - 2025
 * Part_ 02
 *
* This file defines a Greeting class, which holds information about a student's ID, a greeting message, and their birth date (month, day, year).
* It includes getter and setter methods to access and modify these fields, along with a method to return the birth date in a formatted string ("MM/DD/YYYY").
* The class is designed to encapsulate and manage greeting-related data.
*/

// Declares a public class named Greeting.
public class Greeting {

    // Private variables to store the student ID, message, and date components.
    private String studentId;   // stores student's ID
    private String message;     // stores greeting message
    private int month;          // stores birth month
    private int day;            // stores birth day
    private int year;           // stores birth year


    // --- Getters and Setters ---
    // These methods allow controlled access and modification of the private fields.

    // Public method to get the value of studentId.
    public String getStudentId() {
        return studentId;
    }

    // Public method to set the value of studentId.
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Public method to get the value of message.
    public String getMessage() {
        return message;
    }

    // Public method to set the value of message.
    public void setMessage(String message) {
        this.message = message;
    }

    // Public method to get the value of month.
    public int getMonth() {
        return month;
    }

    // Public method to set the value of month.
    public void setMonth(int month) {
        this.month = month;
    }

    // Public method to get the value of day.
    public int getDay() {
        return day;
    }

    // Public method to set the value of day.
    public void setDay(int day) {
        this.day = day;
    }

    // Public method to get the value of year.
    public int getYear() {
        return year;
    }

    // Public method to set the value of year.
    public void setYear(int year) {
        this.year = year;
    }

    // --- Utility Method ---
    // Public method to return the date formatted as MM/DD/YYYY.
    public String getFormattedDate() {
        // Formats the month, day, and year using two digits for month/day and four digits for year.
        return String.format("%02d/%02d/%04d", month, day, year);
    }
}
