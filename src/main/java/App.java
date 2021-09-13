/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

public class App
{
    public static void main( String[] args )
    {
        double height = Input.GetDouble("What is your height in inches? ");
        double weight = Input.GetDouble("What is your weight in pounds? ");

        double bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f.\n", bmi);

        if (bmi >= 18.5 && bmi <= 25)
            System.out.print("You are within the ideal weight range.");

        if (bmi > 25)
            System.out.print("You are overweight. You should see your doctor.");

        if (bmi < 18.5)
            System.out.print("You are underweight. You should see your doctor.");
    }
}