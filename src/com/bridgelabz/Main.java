package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        System.out.println("Welcome to Address Book Program ");
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        // While loop for showing the menu until user not want to exit
        while(!exit) {
        System.out.println("\nEnter 1. Add new Contact \nEnter 2. Edit Contact " +
                "\nEnter 3. Show Contacts \nEnter 4. Exit");
        int num = sc.nextInt();

        // writing the switch case
            switch (num) {

                case 1:
                    addressBook.addNewContacts();
                    break;

                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.showContacts();
                    break;

                case 4:
                    System.out.println("Exit !");
                    exit = true;
                    break;

                default:
                    System.out.println("Enter the correct number !");
                    break;
            }
        }
    }
}