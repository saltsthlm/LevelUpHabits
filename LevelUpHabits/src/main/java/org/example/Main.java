package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting LevelUpHabit now..../n \"Enter a user's name to create user: ");
        String userName = scanner.next();
        User newUser = new User(userName);

        HabitManager habitManager = new HabitManager();

        System.out.println("Enter a habit's name to create habit: ");
        String habitName = scanner.next();
        System.out.println("Enter difficulty level from (1, 2, 3): ");
        int diffLevel = scanner.nextInt();
        Habit newHabit = habitManager.createHabit(habitName, diffLevel);
        System.out.println(newHabit);
        //1. create a habit
        //2. mark a habit as done
        //3. view habit streaks
        //4. view xp & level
        //5. exit

        scanner.close();

    }
}