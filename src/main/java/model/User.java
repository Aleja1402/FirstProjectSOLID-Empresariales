package model;

import java.time.LocalDate;

public class User extends Person {
    private SubscriptionPlan subscriptionPlan;
    private Program program;

    // Constructor
    public User(String idUser, String nickName, String password, String name, String surname, String country, String city, String address, String email, String phoneNumber, LocalDate birthdate, SubscriptionPlan subscriptionPlan, Program program) {
        super(idUser, nickName, password, name, surname, country, city, address, email, phoneNumber, birthdate);
        this.subscriptionPlan = subscriptionPlan;
        this.program = program;
    }

    // Getters and setters
    public SubscriptionPlan getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}