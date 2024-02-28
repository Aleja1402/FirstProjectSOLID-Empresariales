package model;

public class Program {

    private String name;
    private String description;
    private int minutesPerRoutine;
    private int daysPerWeek;

    // Constructor
    public Program(String name, String description, int minutesPerRoutine, int daysPerWeek) {
        this.name = name;
        this.description = description;
        this.minutesPerRoutine = minutesPerRoutine;
        this.daysPerWeek = daysPerWeek;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinutesPerRoutine() {
        return minutesPerRoutine;
    }

    public void setMinutesPerRoutine(int minutesPerRoutine) {
        this.minutesPerRoutine = minutesPerRoutine;
    }

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }
}