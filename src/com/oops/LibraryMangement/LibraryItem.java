package com.oops.LibraryMangement;

public abstract class LibraryItem {

    private String title;
    private String author;
    private String publicationYear;

    public LibraryItem(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", publicationYear='" + publicationYear + '\''
                ;
    }
}
