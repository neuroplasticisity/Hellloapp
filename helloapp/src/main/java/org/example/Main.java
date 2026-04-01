package org.example;
public class Main{
    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            message = String.join(", ", args);
        } else {
            message = "World";
        }

        // UC5 enhancement: count names
        int count = (args.length > 0) ? args.length : 1;

        System.out.println("Hello, " + message + "!");
        System.out.println("Number of people greeted: " + count);
    }
}