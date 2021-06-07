/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 6 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Write a program to evenly divide pizzas.
Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even.
Display the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.
 */

package org.example;
import java.util.Scanner;

public class practiceexample6 {
    public static void main(String[] args) {

        int people, pizzas, slices, total, quotient,remainder; //declare variables
        Scanner sc=new Scanner(System.in);

        System.out.print("How many people?"); //prompt to enter number of people
        people=sc.nextInt();

        System.out.print("How many pizzas do you have?"); //prompt to enter number of pizzas
        pizzas=sc.nextInt();

        System.out.print("How many slices of pizza?"); //prompt to enter number of pizza slices
        slices=sc.nextInt();

        total=pizzas*slices; //math equation

        System.out.println(" "+people+" people with "+pizzas+" pizzas ("+total+"slices)"); //print results 1
        quotient=total/people;

        System.out.println("Each person gets "+quotient+" pieces of pizza"); //print results 2
        remainder=total%people;

        System.out.println("There are "+remainder+" leftover pieces"); //print results 3
    }
}
