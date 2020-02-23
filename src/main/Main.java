package main;

import defination.MyProgram;
import defination.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        MyProgram myProgram = new MyProgram();
        while (true) {
            System.out.print("Welcome to Bharti's Contact List App: \n" +
                    " Press 1 to add a new contact \n" +
                    " Press 2 to view all contacts \n" +
                    " Press 3 to search for a contact \n" +
                    " Press 4 to delete a contact \n" +
                    " Press 5 to exit program");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    Person result = fetchDetails();
                    myProgram.add(result);
                    break;
                }
                case 2: {
                    myProgram.view();
                    break;
                }
                case 3: {
                    System.out.println("You could search for a contact from their first names: ");
                    String name = scanner.nextLine();
                    myProgram.search(name);
                    break;
                }
                case 4: {
                    System.out.println("Here are all your contacts:");
                    myProgram.displayList();
                    System.out.println("Press the number against the contact to delete it: ");
                    int num = scanner.nextInt();
                    myProgram.delete(num);
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Wrong Choice!");
                    break;

                }

            }
        }
    }
}
