package org.example;

import java.util.List;
import java.util.Scanner;

public class HabitManager {
    Scanner scanner = new Scanner(System.in);
    //Manages adding/removing habits, marking completion, calculating streaks and XP, and leveling users.
    public Habit createHabit(String nameGiven, int diffLevel){
        Habit newHabit = new Habit(nameGiven,diffLevel);
        return newHabit;
    }
    public void addHabitToUser(User user, Habit habit){
        user.addHabits(habit);
    }
    public void markAsCompleted(User user, Habit habit){
        List<Habit> habits = user.getHabits();
        if(habits.contains(habit)){
            updateXP_(user, habit);
            habit.markComplete(true);
        }
    }
    public void updateXP_(User user, Habit habit){
        int scoreThreshold = habit.getxP();
        user.updateTotalXP(scoreThreshold);
    }


}
