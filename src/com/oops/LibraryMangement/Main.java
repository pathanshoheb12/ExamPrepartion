package com.oops.LibraryMangement;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The God of Small Things", "Arundhati Roy", "1997", "Fiction");
        Book book2 = new Book("Midnight's Children", "Salman Rushdie", "1981", "Historical Fiction");
        Book book3 = new Book("The White Tiger", "Aravind Adiga", "2008", "Fiction");

        Magazine magazine1 = new Magazine("India Today", "Various Authors", "2025", 1);
        Magazine magazine2 = new Magazine("Outlook", "Various Authors", "2025", 2);

        Library library = new Library();
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        library.addItem(magazine1);
        library.addItem(magazine2);

        library.displayAllItems();


        Member member1 = new Member("shoheb", 1);
        Member member2 = new Member("Achal", 2);

        library.addMember(member1);
        library.addMember(member2);

        library.displayAllMembers();
        book1.borrowItem(member1);
        magazine1.borrowItem(member2);


        Librarian employee1 = new Librarian("Raaj", 111, library);
        System.out.println(employee1);
        Library.noOfItems();


    }
}
