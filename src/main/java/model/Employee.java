package model;

import java.time.LocalDate;

public class Employee extends Person {
    private String idEmployee;
    private String position;
    private String salary;

    // Constructor
    public Employee(String idUser, String nickName, String password, String name, String surname, String country, String city, String address, String email, String phoneNumber, LocalDate birthdate, String idEmployee, String position, String salary) {
        super(idUser, nickName, password, name, surname, country, city, address, email, phoneNumber, birthdate);
        this.idEmployee = idEmployee;
        this.position = position;
        this.salary = salary;
    }

    // Getters and setters
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
