package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> contactsArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addNewContacts() {

        Contacts contacts = new Contacts();
        System.out.println("\nEnter the following detail");

        System.out.println("\nEnter First Name ");
        contacts.setFirstName(sc.nextLine());
        System.out.println("Enter Last Name ");
        contacts.setLastName(sc.nextLine());
        System.out.println("Enter Address ");
        contacts.setAddress(sc.nextLine());
        System.out.println("Enter Email Id ");
        contacts.setEmailId(sc.nextLine());
        System.out.println("Enter City ");
        contacts.setCity(sc.nextLine());
        System.out.println("Enter State ");
        contacts.setState(sc.nextLine());
        System.out.println("Enter Zip Code ");
        contacts.setZipCode(sc.nextInt());
        System.out.println("Enter Phone No. ");
        contacts.setPhoneNo(sc.nextInt());

        contactsArrayList.add(contacts);
        System.out.println("\nContact added successfully !");
    }

    public void showContacts() {

        if(contactsArrayList.size() > 0) {
            for (int i = 0; i < contactsArrayList.size(); i++) {
                System.out.println("\n"+contactsArrayList);
            }
        }
        else
            System.out.println("No more Contacts !");
    }
}