package com.oops.LibraryMangement;

public class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;

    public Magazine(String title, String author, String publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine " + super.toString() +
                "issueNumber=" + issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public void borrowItem(Member member) {
        System.out.println("borrowing Magazine by Member " + member.getMemberName() + " " + "title is : " + getTitle() + " Issue Number " + getIssueNumber());

    }

    @Override
    public void returnItem(Member member) {

        System.out.println("returning Magazine by Member " + member.getMemberName() + " title is : " + getTitle() + " Issue Number " + getIssueNumber());

    }
}
