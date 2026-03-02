package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Starting LevelUpHabit now....");
        System.out.println("Enter a user's name to create user:");
        Scanner scanner = new Scanner(System.in);
        String nameGiven = scanner.next();
        User newUser = new User(nameGiven);

    }
}