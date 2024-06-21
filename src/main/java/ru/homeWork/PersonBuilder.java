package ru.homeWork;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String city;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, city);
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("Вы не указали имя или фамилию");
        } else if (this.age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        } else {
            return person;
        }
    }

}
