package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("\nName: " + name + "\n" + "City: " + city);
        System.out.println("Age: " + age + "\n" + "Hobby:" + hobby);

    }


}

