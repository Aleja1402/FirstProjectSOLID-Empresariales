package model;

public class SubscriptionPlan {
    private String name;
    private float duration;
    private float monthlyPrice;

    // Constructor
    public SubscriptionPlan(String name, float duration, float monthlyPrice) {
        this.name = name;
        this.duration = duration;
        this.monthlyPrice = monthlyPrice;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(float monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }
}