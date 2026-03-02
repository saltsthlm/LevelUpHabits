# Personal Habit & Progress Tracker

## Project Overview
A gamified habit tracker that helps users build and maintain daily habits. Users earn XP, track streaks, and level up based on their real-life progress. This project emphasizes object-oriented design and is designed to be expandable and reusable.

---

## Core Objectives
- Track habits and their completion.
- Maintain daily records of habit progress.
- Calculate streaks for each habit.
- Assign XP for habit completion.
- Level up users based on accumulated XP.
- Provide feedback on habit progress and leveling.
- Architecture should allow for future expansions (notifications, GUI, stats, files, etc.).

---

## Key Components
- **Habit**: Represents a single habit with attributes like difficulty, streak, and XP reward.
- **User**: Represents a user with a collection of habits, total XP, and current level.
- **DailyRecord**: Stores daily completion status of habits.
- **HabitManager**: Manages adding/removing habits, marking completion, calculating streaks and XP, and leveling users.

---

## Requirements / Features
- Add, remove, and view habits.
- Mark habits as completed each day.
- Track streaks for each habit.
- Assign XP based on habit difficulty and streak.
- Calculate total XP and user level.
- Store daily progress for each habit.
- Notify or inform users when they level up.
- Optional: Support different types of habits (e.g., physical, mental).
- Optional: Expand with stats, charts, notifications, GUI, or file/database storage.

---

## Implementation Notes
- Use object-oriented principles: classes, encapsulation, composition, and optionally inheritance.
- Keep the system modular for future expansion.
- Focus on creating a meaningful gamified experience for real-life habit tracking.

---

## Level Notes
![](/Images/Levels.png)