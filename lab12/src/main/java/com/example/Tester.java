package com.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "Новичок", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Средний", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт: " + experienceInYears + " лет");
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Зарплата: $" + salary);
    }

    public void printDetails(String additionalInfo) {
        System.out.println("Дополнительная информация: " + additionalInfo);
        printDetails();
    }

    public void printDetails(String additionalInfo, int additionalYears) {
        System.out.println("Дополнительная информация: " + additionalInfo);
        System.out.println("Дополнительный опыт: " + additionalYears + " лет");
        printDetails();
    }

    public static void staticMethodExample() {
        System.out.println("Это статический метод.");
    }
}
