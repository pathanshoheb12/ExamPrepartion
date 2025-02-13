package com.oops.LibraryMangement;

public class Librarian {
    private String name;
    private int employeeId;
    private Library library;

    public Librarian(String name, int employeeId, Library library) {
        this.name = name;
        this.employeeId = employeeId;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", library=" + library +
                '}';
    }
}
