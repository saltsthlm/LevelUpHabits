package org.example;

import java.util.Scanner;

public class HabitManager {
    Scanner scanner = new Scanner(System.in);
    //Manages adding/removing habits, marking completion, calculating streaks and XP, and leveling users.
    public Habit createHabit(){
        System.out.println("Enter a habit's name to create habit: ");
        String nameGiven = scanner.next();
        System.out.println("Enter difficulty level from (1, 2, 3): ");
        int diffLevel = scanner.nextInt();
        Habit newHabit = new Habit(nameGiven,diffLevel);
        scanner.close();
        return newHabit;
    }
    public void addHabitToUser(User user, Habit habit){
        user.addHabits(habit);
    }
    public void markAsCompleted(){

    }


}
