package org.example;

import java.util.Scanner;

public class UserManager {
    public User createUser(){
        System.out.println("Starting LevelUpHabit now..../n \"Enter a user's name to create user: ");
        Scanner scanner = new Scanner(System.in);
        String nameGiven = scanner.next();
        User newUser = new User(nameGiven);
        scanner.close();
        return newUser;
    }
}
