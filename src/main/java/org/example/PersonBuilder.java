package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address = null;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Name and surname must be specified");
        }
        if (age < -1) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        Person person = new Person(name, surname);
        person.age = age;
        person.address = address;
        return person;
    }
}
