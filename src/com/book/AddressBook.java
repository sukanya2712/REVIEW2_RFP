package com.book;

import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  no  of details you want to add");
        int noOfContacts= sc.nextInt();

        AddressBookMain addresscon = new AddressBookMain();
        for (int i=0;i<noOfContacts;i++){
            System.out.println("Enter first name ");
            String firstName = sc.next();
            System.out.println("Enter age ");
            String age = sc.next();
            System.out.println("Enter  phoneno ");
            String phoneNo = sc.next();
            System.out.println("Enter city ");
            String city = sc.next();
            System.out.println("Enter state ");
            String state = sc.next();

            Contact contact = new Contact(firstName,age,phoneNo,city,state);
            addresscon.addContact(contact);

        }

        addresscon.printAddressBook();



    }
}
