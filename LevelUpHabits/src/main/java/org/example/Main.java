package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting LevelUpHabit now....\nEnter a user's name to create user: ");
        String userName = scanner.next();
        User user = new User(userName);

        HabitManager habitManager = new HabitManager();
        int option;
        do{
            System.out.println("\nChoose one of the following options by entering a number:");
            System.out.println("1. Create a habit.");
            System.out.println("2. Mark a habit as Done.");
            System.out.println("3. Remove Habit.");
            System.out.println("4. View Habit Streaks.");
            System.out.println("5. View your XP & levels.");
            System.out.println("6. Exit.");
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("Enter a habit's name to create habit: ");
                String habitName = scanner.next();
                System.out.println("Enter difficulty level from (1, 2, 3): ");
                int diffLevel = scanner.nextInt();
                Habit newHabit = habitManager.createHabit(habitName, diffLevel);
                habitManager.addHabitToUser(user, newHabit);
                System.out.println("Habit '" + habitName + "' added!");
            }
            else if(option == 2){
                List<Habit>  habitList= user.getHabits();
                if(!habitList.isEmpty()){
                    System.out.println("Which habit to mark complete?");
                    for(int i = 0; i<habitList.size(); i++){
                        System.out.println(i+1 + ". " + habitList.get(i).getName() + "\n");
                    }
                    int whichHabit = scanner.nextInt();
                    Habit habitToComplete = user.getHabits().get(whichHabit-1);
                    habitManager.markAsCompleted(user, habitToComplete);
                    System.out.println("Habit '"+ habitToComplete.getName() +"' marked complete!");
                }
                else{
                    System.out.println("No habits to mark done yet.");
                }
            }
            else if(option == 3){
                List<Habit>  habitList= user.getHabits();
                if(!habitList.isEmpty()){
                    System.out.println("Which habit to remove?");
                    for(int i = 0; i<habitList.size(); i++){
                        System.out.println(i+1 + ". " + habitList.get(i).getName() + "\n");
                    }
                    int whichHabit = scanner.nextInt();
                    Habit habitToRemove = user.getHabits().get(whichHabit-1);
                    habitManager.removeHabitFromUser(user, habitToRemove);
                    System.out.println("Habit '"+ habitToRemove.getName() +"' removed!");
                }
                else{
                    System.out.println("No such habits exist.");
                }
            }
            else if(option == 4){
                System.out.println("Your habits and streaks:");
                for (Habit h : user.getHabits()){
                    System.out.println("- "+ h.getName() + " | Streak: " + h.getStreak() + " | Completed? " + h.isComplete());
                }

            }
            else if(option == 5){
                System.out.println("Your XPs and Levels:");
                System.out.println("Total XP: "+ user.getTotalXP() + " | Level: " + user.getCurrentLevel());
                }

        }while(option != 6);

        System.out.println("Exiting .....");

        scanner.close();
    }
}