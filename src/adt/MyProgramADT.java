package adt;

import defination.Person;

public interface MyProgramADT {
    //add() method to add an contact to the contact list
    void add(Person item);
    //view() method to display all the contacts in the contact list
    void view();
    //search() method to search for a contact in the contact list
    void search(String item);
}
