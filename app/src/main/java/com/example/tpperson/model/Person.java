// Person.java
package com.example.tpperson.model;

public class Person {
    private String name;
    private String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public byte getRole() {
        return 0;
    }
}
