package com.company;

import java.util.Scanner;
public class AgeProgram {

    public static void main(String args[]) {

        Scanner keyInput = new Scanner (System.in);
        int age;
        String name;

        System.out.println("Enter your name: ");
        name = keyInput.nextLine();

        System.out.println("Enter your age: ");
        age = keyInput.nextInt();


        if (age <= 18) {
            System.out.println(name + ", You are too young for this page!");
        } else if (age <= 50) {
            System.out.println(name + ",your access is granted, young (deran)!");
        } else if (age <= 70) {
            System.out.println(name + ", This page has risk for your age!");
        } else if (age <= 85) {
            System.out.println(name + ", How you finde in this page!");
        } else {
            System.out.println(name + "You are amazing being!");
        }
        keyInput.close();
    }
}