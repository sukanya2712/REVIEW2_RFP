package com.book;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    private List<Contact> contacts;
    public  AddressBookMain(){
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void printAddressBook(){
        System.out.println("AddressBook INFO as follows : ");
        for (Contact contact : contacts){
            System.out.println(contact.getName() + "-" + contact.getAge() + "-" + contact.getPhonenumber() +"-" +
                    contact.getState() + "-" + contact.getCity());
        }
    }
}
