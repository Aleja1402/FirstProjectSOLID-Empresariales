package controller;

import java.util.List;
import model.Person;

public interface IController {
    
    void handleCreate(String name, String surname, String program);
    void handleRead();
    List<Person> handleReadM();
    void handleUpdate(String userName, String name, String surname);
    void handleDelete(String userName);

}