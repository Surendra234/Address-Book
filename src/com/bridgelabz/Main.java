package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program ");
        // creating a contact
        Contacts contacts1 = new Contacts("surendra","Mahawar","365 gumanpura",
                "surendramahawar873@gmail.com","kota","Rajasthan",324007,123456781);
        System.out.println(contacts1);
    }
}