package org.example;

import java.util.Scanner;

public class HabitManager {
    //Manages adding/removing habits, marking completion, calculating streaks and XP, and leveling users.
    public Habit createHabit(){
        System.out.println("Enter a habit's name to create habit: ");
        Scanner scanner = new Scanner(System.in);
        String nameGiven = scanner.next();

        Habit newHabit = new Habit(nameGiven);
        scanner.close();
        return newHabit;
    }
}
