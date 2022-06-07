package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дистанцию бега ");
        int run = scanner.nextInt();
        System.out.print("Введите дистанцию плавания ");
        int swim = scanner.nextInt();
        scanner.close();
        Cat cat1 = new Cat(run, swim, "Барсик", 0, 150);
        cat1.running();
        cat1.swimming();
        Cat cat2 = new Cat(run, swim, "Мурзик", 0, 150);
        cat2.running();
        cat2.swimming();
        Cat cat3 = new Cat(run, swim, "Перчик", 0, 150);
        cat3.running();
        cat3.swimming();
        Dog dog1 = new Dog(run, swim, "Тузик", 10, 500);
        dog1.running();
        dog1.swimming();
        Dog dog2 = new Dog(run, swim, "Барбос", 10, 500);
        dog2.running();
        dog2.swimming();
        Dog dog3 = new Dog(run, swim, "Кузя", 10, 500);
        dog3.running();
        dog3.swimming();
        Cat.count();
        Dog.count();
        Animal.count();
    }
}
