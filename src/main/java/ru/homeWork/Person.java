package ru.homeWork;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;
    protected boolean hasAge;
    protected boolean hasCity;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        hasAge = true;
    }

    public void happyBirthday() {
        if (age > 0) {
            age += 1;
        }
    }

    public void setAddress(String city) {
        this.city = city;
    }

    boolean hasAddress() {
        if (city != null) {
            return hasCity = true;
        } else {
            return hasCity = false;
        }
    }

    public boolean hasAge() {
        if (age > 0) {
            return hasAge = true;
        } else {
            return hasAge = false;
        }
    }

    public PersonBuilder newChildBuilder(int age) {

        return new PersonBuilder()
                .setSurname(getSurname())
                .setAge(age)
                .setAddress(getCity());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age=" + age +
               ", city='" + city + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age && hasAge == person.hasAge && hasCity == person.hasCity && name.equals(person.name)
               && surname.equals(person.surname) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(city);
        result = 31 * result + Boolean.hashCode(hasAge);
        result = 31 * result + Boolean.hashCode(hasCity);
        return result;
    }
}
