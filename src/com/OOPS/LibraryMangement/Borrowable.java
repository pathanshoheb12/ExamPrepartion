package com.OOPS.LibraryMangement;

public interface Borrowable {
    void borrowItem(Member member);

    void returnItem(Member member);
}
