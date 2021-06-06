
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;
import java.lang.Math;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double interest = scanner.nextDouble();
        System.out.println("Enter the number of years: ");
        double years = scanner.nextDouble();

        double calcInterest = interest / 100;
        double investment = principal * (1 + calcInterest * years);
        double roundedInvestment = Math.round(investment * 100.0) / 100.0;

        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth $" + roundedInvestment + ".");
    }
}