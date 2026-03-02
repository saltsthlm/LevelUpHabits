package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Habit newHabit;

        System.out.println("Starting LevelUpHabit now....\nEnter a user's name to create user: ");
        String userName = scanner.next();
        User newUser = new User(userName);

        HabitManager habitManager = new HabitManager();
        int option = 1;
        do{
            System.out.println("Choose one of the following options by entering a number:");
            System.out.println("1. Create a habit.");
            System.out.println("2. Mark a habit as Done.");
            System.out.println("3. View Habit Streaks.");
            System.out.println("4. View your XP & levels.");
            System.out.println("5. Exit.");
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("Enter a habit's name to create habit: ");
                String habitName = scanner.next();
                System.out.println("Enter difficulty level from (1, 2, 3): ");
                int diffLevel = scanner.nextInt();
                newHabit = habitManager.createHabit(habitName, diffLevel);
            }
            if(option == 2){
                habitManager.markAsCompleted(newUser, newHabit);

            }
            if(option == 3){

            }
            else{

            }

        }while(option != 5);

        System.out.println("Exiting .....");

        scanner.close();
    }
}