package defination;

import adt.MyProgramADT;

public class MyProgram implements MyProgramADT, defination.MyProgramADT {
    // This reference variable will store the reference to the first contact of the contact list.
    private Node head = null;

    // This variable will store the current size of the contact list.
    private int size = 0;
    //add() method to add a contact in the contact list.
    @Override
    public void add(Person data) {
        Node node = new Node(data, head);
        head = node;
        size++;
    }
}
