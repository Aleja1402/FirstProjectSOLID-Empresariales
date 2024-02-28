package controller;

import java.util.List;
import model.Person;
import view.GUIPrincipal;

public class Controller implements IController {
    private GUIPrincipal ppal;
    private Person person;

    // Constructor
    public Controller() {        
        GUIPrincipal ppal = new GUIPrincipal(this);
        ppal.setVisible(true);
        person = new Person();
    }

    @Override
    public void handleCreate(String userName, String name, String surname) {
        Person person = new Person(userName, name, surname);
        person.addPerson(person); 
    }

    //Check:
    @Override
    public void handleRead() {   
        person.getPeopleList();   
    }

    public void handleUpdate(String userName, String name, String surname) {
        Person wanted = person.findPersonByUserName(userName);
        if (wanted != null) {
            wanted.setName(name);
            wanted.setSurname(surname);
        }
    }

    public void handleDelete(String userName) {
        person.removePersonByUserName(userName);
    }

}