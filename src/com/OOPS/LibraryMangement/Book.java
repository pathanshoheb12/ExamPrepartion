package com.OOPS.LibraryMangement;

public class Book extends LibraryItem implements Borrowable {
    private String genre;


    public Book(String title, String author, String publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book " + super.toString() + " " +
                "genre='" + genre + '\'';
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());


    }

    @Override
    public void borrowItem(Member member) {
        System.out.println("borrowing Book by Member " + member.getMemberName() + " " + "title is : " + getTitle());
    }

    @Override
    public void returnItem(Member member) {
        System.out.println("returning Book by Member " + member.getMemberName() + " title is : " + getTitle());

    }

}
