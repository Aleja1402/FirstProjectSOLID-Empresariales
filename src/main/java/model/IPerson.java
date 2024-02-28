package model;

import java.time.LocalDate;

public interface IPerson {
    String getId();
    String getUserName();
    String getPassword();
    String getName();
    String getSurname();
    String getCountry();
    String getCity();
    String getAddress();
    String getEmail();
    String getPhoneNumber();
    LocalDate getBirthdate();
    void setId(String id);
    void setUserName(String userName);
    void setPassword(String password);
    void setName(String name);
    void setSurname(String surname);
    void setCountry(String country);
    void setCity(String city);
    void setAddress(String address);
    void setEmail(String email);
    void setPhoneNumber(String phoneNumber);
    void setBirthdate(int year, int month, int day);
    int getAge();
}