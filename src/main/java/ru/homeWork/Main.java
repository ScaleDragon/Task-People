package ru.homeWork;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder(5)
                .setName("Антошка")
                .setAddress("Moscow")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        // проверка метода happyBirthday()
        son.happyBirthday();
        System.out.println("Антошке исполнилось " + son.getAge());

//        try {
//            // Не хватает обяхательных полей
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
    }
}
