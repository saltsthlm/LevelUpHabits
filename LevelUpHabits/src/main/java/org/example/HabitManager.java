package org.example;

import java.util.List;
import java.util.Scanner;

public class HabitManager {
    public Habit createHabit(String nameGiven, int diffLevel){
        return new Habit(nameGiven,diffLevel);
    }
    public void addHabitToUser(User user, Habit habit){
        user.addHabits(habit);
    }
    public void markAsCompleted(User user, Habit habit){
        List<Habit> habits = user.getHabits();
        if(habits.contains(habit)){
            updateXP(user, habit);
            if(habit.getStreak()== 0 || habit.isComplete()) {
                habit.updateStreak();
            }
            habit.markComplete();
        }
    }
    public void updateXP(User user, Habit habit){
        int scoreThreshold = habit.getxP();
        user.updateTotalXP(scoreThreshold);
        user.updateCurrentLevel(user.getTotalXP());
    }


}
