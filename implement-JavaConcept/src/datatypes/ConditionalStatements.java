package datatypes;

/**
 * Complete Guide to Conditional Statements in Java
 * Definitions:
 * if: A conditional statement that executes a block of code only if a specified condition is true.
 * else: Used with 'if' to execute an alternative block of code when the 'if' condition is false.
 * switch: A multi-way branch statement that allows a variable to be tested for equality against a list of values.
 */

public class ConditionalStatements {
    public static void main(String[] args) {

        System.out.println("=== IF-ELSE EXAMPLES ===\n");

        // Example 1: Age Verification System
        System.out.println("Example 1: Age Verification System");
        int age = 25;
        if (age >= 18) {
            System.out.println("Access granted - You are an adult"); // Access granted - You are an adult
        } else {
            System.out.println("Access denied - You are a minor");
        }
        System.out.println();

        // Example 2: Grade Classification System
        System.out.println("Example 2: Grade Classification System");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A - Excellent");
        } else if (score >= 80) {
            System.out.println("Grade: B - Good"); // Grade: B - Good
        } else if (score >= 70) {
            System.out.println("Grade: C - Average");
        } else if (score >= 60) {
            System.out.println("Grade: D - Below Average");
        } else {
            System.out.println("Grade: F - Fail");
        }
        System.out.println();

        // Example 3: Login Authentication
        System.out.println("Example 3: Login Authentication");
        String username = "admin";
        String password = "password123";
        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Login successful - Welcome Admin"); // Login successful - Welcome Admin

        } else {
            System.out.println("Login failed - Invalid credentials");
        }
        System.out.println();

        // Example 4: Weather Recommendation System
        System.out.println("Example 4: Weather Recommendation System");
        int temperature = 25;
        boolean isRaining = false;
        if (temperature > 30) {
            System.out.println("It's hot! Wear light clothes");
        } else if (temperature < 10) {
            System.out.println("It's cold! Wear warm clothes");
        } else if (isRaining) {
            System.out.println("It's raining! Take an umbrella");
        } else {
            System.out.println("Weather is pleasant - Enjoy your day"); // Weather is pleasant - Enjoy your day
        }
        System.out.println();

        // Example 5: Banking System - Account Status
        System.out.println("Example 5: Banking System - Account Status");
        double balance = 1500.0;
        double withdrawal = 200.0;
        if (balance >= withdrawal) {
            System.out.println("Withdrawal approved - Transaction successful"); // Withdrawal approved - Transaction successful
        } else {
            System.out.println("Insufficient funds - Transaction declined");
        }
        System.out.println();

        // Example 6: Eligibility Checker for Driving License
        System.out.println("Example 6: Eligibility Checker for Driving License");
        int applicantAge = 16;
        boolean hasPassedTest = true;
        if (applicantAge >= 18 && hasPassedTest) {
            System.out.println("Eligible for driving license");
        } else if (applicantAge >= 16 && applicantAge < 18 && hasPassedTest) {
            System.out.println("Eligible for learner's permit"); // Eligible for learner's permit
        } else {
            System.out.println("Not eligible for driving license");
        }
        System.out.println();

        // Example 7: Discount Calculation System
        System.out.println("Example 7: Discount Calculation System");
        double purchaseAmount = 1200.0;
        boolean isPremiumMember = true;
        if (purchaseAmount > 1000 && isPremiumMember) {
            System.out.println("30% discount applied"); // 30% discount applied
        } else if (purchaseAmount > 500 || isPremiumMember) {
            System.out.println("15% discount applied");
        } else {
            System.out.println("No discount available");
        }
        System.out.println();

        // Example 8: Health BMI Calculator
        System.out.println("Example 8: Health BMI Calculator");
        double bmi = 26.5;
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight"); // Overweight
        } else {
            System.out.println("Obese");
        }
        System.out.println();

        // Example 9: Network Connectivity Check
        System.out.println("Example 9: Network Connectivity Check");
        boolean isConnected = true;
        boolean isWiFi = true;
        if (isConnected && isWiFi) {
            System.out.println("Connected via WiFi - High speed"); // Connected via WiFi - High speed
        } else if (isConnected && !isWiFi) {
            System.out.println("Connected via Mobile Data - Standard speed");
        } else {
            System.out.println("No internet connection");
        }
        System.out.println();

        // Example 10: E-commerce Shipping Cost Calculator
        System.out.println("Example 10: E-commerce Shipping Cost Calculator");
        double orderTotal = 75.0;
        String shippingMethod = "express";
        if (orderTotal >= 100) {
            System.out.println("Free shipping available");
        } else if (shippingMethod.equals("standard")) {
            System.out.println("Standard shipping: $5.99");
        } else if (shippingMethod.equals("express")) {
            System.out.println("Express shipping: $12.99"); // Express shipping: $12.99
        } else {
            System.out.println("Pickup: Free");
        }
        System.out.println();

        System.out.println("=== SWITCH CASE EXAMPLES ===\n");

        // Switch Example 1: Day of Week Selector
        System.out.println("Switch Example 1: Day of Week Selector");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // Wednesday
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println();

        // Switch Example 2: Menu Selection System
        System.out.println("Switch Example 2: Menu Selection System");
        char choice = 'B';
        switch (choice) {
            case 'A':
            case 'a':
                System.out.println("Selected Option A - Account Settings");
                break;
            case 'B':
            case 'b':
                System.out.println("Selected Option B - Billing Information"); // Selected Option B - Billing Information
                break;
            case 'C':
            case 'c':
                System.out.println("Selected Option C - Customer Support");
                break;
            case 'D':
            case 'd':
                System.out.println("Selected Option D - Download Reports");
                break;
            default:
                System.out.println("Invalid selection");
        }
        System.out.println();

        // Switch Example 3: HTTP Status Code Handler
        System.out.println("Switch Example 3: HTTP Status Code Handler");
        int statusCode = 404;
        switch (statusCode) {
            case 200:
                System.out.println("OK - Request successful");
                break;
            case 400:
                System.out.println("Bad Request - Invalid input");
                break;
            case 401:
                System.out.println("Unauthorized - Authentication required");
                break;
            case 403:
                System.out.println("Forbidden - Access denied");
                break;
            case 404:
                System.out.println("Not Found - Resource doesn't exist"); // Not Found - Resource doesn't exist

                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            default:
                System.out.println("Unknown status code");
        }
        System.out.println();

        // Switch Example 4: Employee Role Management
        System.out.println("Switch Example 4: Employee Role Management");
        String role = "manager";
        switch (role.toLowerCase()) {
            case "admin":
                System.out.println("Full system access - Admin privileges");
                break;
            case "manager":
                System.out.println("Department access - Manager privileges"); // Department access - Manager privileges
                break;
            case "employee":
                System.out.println("Limited access - Employee privileges");
                break;
            case "guest":
                System.out.println("Read-only access - Guest privileges");
                break;
            default:
                System.out.println("Unknown role - No access");
        }
        System.out.println();

        // Switch Example 5: Payment Method Processor
        System.out.println("Switch Example 5: Payment Method Processor");
        String paymentMethod = "credit";
        switch (paymentMethod) {
            case "credit":
                System.out.println("Processing credit card payment"); //  Processing credit card payment
                break;
            case "debit":
                System.out.println("Processing debit card payment");
                break;
            case "paypal":
                System.out.println("Redirecting to PayPal");
                break;
            case "bank_transfer":
                System.out.println("Processing bank transfer");
                break;
            case "cash_on_delivery":
                System.out.println("Cash on delivery selected");
                break;
            default:
                System.out.println("Unsupported payment method");
        }

        // Switch Example 6
        System.out.println("Switch Example 6: Jump");
        int number = 2; // if i change the number from 2 to 1 then it will print "Number is 1, 2, or 3"

        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Number is 1, 2, or 3"); // Number is 1, 2, or 3
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("NUmber is not 1, 2, 3, or 4");
                break;
        }
    }
}

// The switch statement can be used with the following data types: byte, short, char, int, String, and enum types.
// It cannot be used with long, float(precise-value), double, or boolean types. => only use if-else

