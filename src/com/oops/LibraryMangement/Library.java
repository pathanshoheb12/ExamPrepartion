package com.oops.LibraryMangement;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<LibraryItem> listOfLibraryItem;
    List<Member> members;
    public static int noOfItems;

    public Library() {
        listOfLibraryItem = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        listOfLibraryItem.add(item);
        noOfItems++;
    }

    public void removeItem(LibraryItem item) {
        listOfLibraryItem.remove(item);
        noOfItems--;
    }

    public void displayAllItems() {
        for (LibraryItem item : listOfLibraryItem) {
            item.displayInfo();
        }
    }

    public static void noOfItems() {
        System.out.println("Total no of Items are :" + noOfItems);
    }

    public void addMember(Member member) {
        members.add(member);

    }

    public void displayAllMembers() {
        System.out.println("Members :" + members);
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfLibraryItem=" + listOfLibraryItem +
                ", members=" + members +
                '}';
    }
}
