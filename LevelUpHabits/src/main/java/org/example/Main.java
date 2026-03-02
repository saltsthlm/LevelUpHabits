package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Starting LevelUpHabit now..../n \"Enter a user's name to create user: ");
        Scanner scanner = new Scanner(System.in);
        String nameGiven = scanner.next();
        User newUser = new User(nameGiven);
        scanner.close();
        //
        HabitManager habitManager = new HabitManager();
        Habit newHabit = habitManager.createHabit();
        //1. create a habit
        //2. mark a habit as done
        //3. view habit streaks
        //4. view xp & level
        //5. exit
    }
}