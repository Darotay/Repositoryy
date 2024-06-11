package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите опцию (1 или 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                String name = "ИМЯ";
                System.out.println("Привет, " + name);
                break;
            case 2:
                Tester tester1 = new Tester("Иван", "Иванов");
                Tester tester2 = new Tester("Александра", "Смирнова", 3);
                Tester tester3 = new Tester("Дмитрий", "Дмитриев", 5, "Продвинутый", 50000.0);

                tester1.printDetails();
                System.out.println("------------------------");
                tester2.printDetails("Дополнительная информация для tester2");
                System.out.println("------------------------");
                tester3.printDetails("Дополнительная информация для tester3", 2);

                Tester.staticMethodExample();
                break;
            default:
                System.out.println("Неверный выбор");
        }

        scanner.close();
    }
}
