package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> contactsArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact(Contacts contacts) {
        contactsArrayList.add(contacts);
    }
    // Method to add new contact
    public void addNewContacts() {

        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts();
        System.out.println("\nFor adding a new contact enter the following detail");

        System.out.println("\nEnter First Name ");
        contacts.setFirstName(sc.next());
        System.out.println("Enter Last Name ");
        contacts.setLastName(sc.next());
        System.out.println("Enter Address ");
        contacts.setAddress(sc.next());
        System.out.println("Enter Email Id ");
        contacts.setEmailId(sc.next());
        System.out.println("Enter City ");
        contacts.setCity(sc.next());
        System.out.println("Enter State ");
        contacts.setState(sc.next());
        System.out.println("Enter Zip Code ");
        contacts.setZipCode(sc.nextInt());
        System.out.println("Enter Phone No. ");
        contacts.setPhoneNo(sc.nextInt());

        // Stored the information in contactsArrayList
        contactsArrayList.add(contacts);
        System.out.println("\nContact added successfully !");
    }

    // Method for Edit the information of Contact
    public void editContact() {

        if(contactsArrayList.size() > 0) {
            System.out.println("Enter the First name of the person");
            String checkFirstName = sc.next();

            for (int i = 0; i < contactsArrayList.size(); i++) {

                if (contactsArrayList.get(i).getFirstName().equals(checkFirstName)) {

                    System.out.println("\nContact founded !");
                    System.out.println("\nWhat you want to update");
                    System.out.println("\nEnter 1. First Name \nEnter 2. Last Name \nEnter 3.Address " +
                            "\nEnter 4. Email id " + "\nEnter 5. City" +
                            "\nEnter 6. state \nenter 7. Zip code \nEnter 8.Phone no. \nEnter 9. Exit");
                    int num = sc.nextInt();

                    switch (num) {

                        case 1:
                            System.out.println("Enter new first Name");
                            contactsArrayList.get(i).setFirstName(sc.next());
                            break;

                        case 2:
                            System.out.println("Enter new last name");
                            contactsArrayList.get(i).setLastName(sc.next());
                            break;

                        case 3:
                            System.out.println("Enter new Address");
                            contactsArrayList.get(i).setAddress(sc.next());
                            break;

                        case 4:
                            System.out.println("Enter new Email id");
                            contactsArrayList.get(i).setEmailId(sc.next());
                            break;

                        case 5:
                            System.out.println("Enter new City ");
                            contactsArrayList.get(i).setCity(sc.next());
                            break;

                        case 6:
                            System.out.println("Enter new State");
                            contactsArrayList.get(i).setState(sc.next());
                            break;

                        case 7:
                            System.out.println("Enter new Zip code");
                            contactsArrayList.get(i).setZipCode(sc.nextInt());
                            break;

                        case 8:
                            System.out.println("Enter new Phone No");
                            contactsArrayList.get(i).setPhoneNo(sc.nextInt());
                            break;

                        case 9:
                            System.out.println("Exit !");
                            break;

                        default:
                            System.out.println("Enter the correct choice !");
                            break;
                    }
                    System.out.println("Contact update successfully !");
                    break;
                }
                else
                    System.out.println("Contact not founded on " +i +" Position");
            }
        }
        else System.out.println("No Contact Founded !");
    }

    // Method for deleted the Contact of person
    public void deleteContact() {

        if(contactsArrayList.size() > 0) {

            System.out.println("Enter the First name of that person which information you want to delete");
            String deletePersonInfo = sc.next();

            for(int i = 0; i < contactsArrayList.size(); i++) {

                if (contactsArrayList.get(i).getFirstName().equals(deletePersonInfo)) {
                    // stored the value of person information in contact ref. variable
                    Contacts contact = contactsArrayList.get(i);
                    contactsArrayList.remove(contact);
                    System.out.println("Contact deleted successfully");
                }
                else
                    System.out.println("Wrong input !");
            }
        }
        else
            System.out.println("No more Contact found !");
    }

    // Method for display all contact
    public void showContacts() {

        if(contactsArrayList.size() > 0) {
            for (int i = 0; i < contactsArrayList.size(); i++) {
                System.out.println("\n"+contactsArrayList);
                break;
            }
        }
        else
            System.out.println("No more Contacts !");
    }
}