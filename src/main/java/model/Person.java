package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import utils.DateTimeUtils;

public class Person implements IPerson {

    private static List<Person> peopleList;
    private String id;
    private String nickName;
    private String password;
    private String name;
    private String surname;
    private String country;
    private String city;
    private String address;
    private String email;
    private String phoneNumber;
    private LocalDate birthdate;
    
    public Person () {
        peopleList = new ArrayList<>();
    }
    
    public Person(String nickName, String name, String surname){
        this.nickName = nickName;
        this.name = name;
        this.surname = surname;
        if (peopleList == null) {
            peopleList = new ArrayList<>();
        }
        //addPerson(this);
    }

    public Person(String id, String nickName, String password, String name, String surname, String country, String city, String address, String email, String phoneNumber, LocalDate birthdate) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthdate = LocalDate.now();
        if (peopleList == null) {
            peopleList = new ArrayList<>();
        }
        //addPerson(this);
    }

    // Getters and setters
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getUserName() {
        return nickName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public void setId(String idUser) {
        this.id = idUser;
    }

    @Override
    public void setUserName(String userName) {
        this.nickName = userName;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setBirthdate(int year, int month, int day) {
        this.birthdate = DateTimeUtils.createDate(year, month, day);
    }

    @Override
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthdate, currentDate).getYears();
    }

    // Methods for the ArrayList
    public void addPerson(Person person) {
        peopleList.add(person);
    }
    
    public static Person findPersonById(String id) {
        for (Person person : peopleList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null; // null if it doesn't find the person.
    }

    public static Person findPersonByUserName(String userName) {
        for (Person person : peopleList) {
            if (person.getUserName().equals(userName)) {
                return person;
            }
        }
        return null; // null if it doesn't find the person.
    }
    
    public static void getPeopleList() {
        System.out.println("-----S-----");
        List<Person> people = peopleList;
        for (Person person : people) {
            System.out.println("UserName: " + person.getUserName());
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
        }
        if (people == null) {
            System.out.println("Empty list.");
        }
        System.out.println("-----E-----");
    }

    public void removePersonByUserName(String userName) {
        Person wanted = null;
        for (Person person : peopleList) {
            if (person.getUserName().equals(userName)) {
                wanted = person;
                peopleList.remove(wanted);
            }
        }
        if (wanted != null) {
            System.out.println("Deleted.");
        } else {
            System.out.println("Not deleted.");
        }      
    }
}