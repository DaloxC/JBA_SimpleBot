/*
DaloxC
*/
package com.company;

import java.util.Scanner;

public class BotMaster {
    final static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        greet("Mr.", "2021");
        remindName();
        guessAge();
        count();
        test();
    }

    //Bot creation
    static void greet(String nameBot, String birthYear) {
        System.out.println("Hello! My name is " + nameBot + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    //Block to ask the user for a name
    static void remindName() {
        String name = s.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    //Block to ask the user for age
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = s.nextInt();
        int remainder5 = s.nextInt();
        int remainder7 = s.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is; " + age + " that's a good time to start programming!");
    }

    //Block to count up to any requested number
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int num = s.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    //Block for user knowledge questions
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the constructor used for in Java?");
        System.out.println("1. It is used to create loops such as for and if/else");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To the is special method for creating and initializing an object created from a class.");
        System.out.println("4. To interrupt the execution of a program.");

        int option = s.nextInt();

        //Block End
        if (option != 3) {
            System.out.println("Please, try again.");
            test();
        } else {
            System.out.println("Congratulations, have a nice day!");
        }
    }
}
