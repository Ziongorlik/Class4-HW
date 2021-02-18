package com.company;

public class Person extends SuperHero implements Styleable{
    private String name;
    private String ID;

    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public void getDressed() {
        System.out.println("I'm wearing a T-shirt");
    }

    @Override
    void useSuperPowers() {
        System.out.println("Using Super Power: Reversing Time!!");
    }
}
