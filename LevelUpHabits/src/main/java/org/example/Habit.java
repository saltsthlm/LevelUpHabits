package org.example;

public class Habit {

    //difficulty level - easy, medium , hard, 1, 2, 3
    //Streak start from 0
    //XP reward start from 0
    private int difficulty = 0;
    private int streak = 0;
    private int xP = 0;
    private boolean isComplete;
    private final String name;

    private final int easy = 1;
    private final int medium = 2;
    private final int hard = 3;
    private final int easyXP = 10;
    private final int mediumXP = 20;
    private final int hardXP = 50;


    public Habit(String name, int difficulty){
        this.name = name;
        this.difficulty = difficulty;
        this.isComplete = false;
        switch (difficulty){
            case medium:
                this.xP = mediumXP;
                break;
            case hard:
                this.xP = hardXP;
                break;
            default:
                this.xP = easyXP;
        }

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

    public void updateStreak() {
        streak += 1;
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

    public void markComplete() {
        isComplete = true;
    }

    public String getName() {
        return name;
    }
}
