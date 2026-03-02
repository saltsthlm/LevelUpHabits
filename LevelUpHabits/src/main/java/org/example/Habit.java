package org.example;

public class Habit {

    //1-10 difficulty level
    //Streak start from 0
    //XP reward start from 0
    private int difficulty = 0;
    private int streak = 0;
    private int xP = 0;
    private boolean isComplete = false;
    private final String name;

    public Habit(String name){
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(int change) {
        difficulty = change;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public void setxP(int xP) {
        this.xP = xP;
    }

    public int getxP() {
        return xP;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getName() {
        return name;
    }

    //Add
    //Remove
    //View


}
