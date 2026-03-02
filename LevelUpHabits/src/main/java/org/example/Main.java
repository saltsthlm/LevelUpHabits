package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        UserManager userManager = new UserManager();
        User newUser = userManager.createUser();
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