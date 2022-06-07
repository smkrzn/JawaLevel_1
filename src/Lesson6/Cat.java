package Lesson6;

public class Cat extends Animal {
    public static int count = 0;

    public Cat(int running, int swimming, String animalName, int maxSwimming, int maxRunning) {
        super(running, swimming, animalName, maxSwimming, maxRunning);
        count++;
    }

    public void swimming(){                         /// В классе Animal уже предусмотрена максимальная дистанция
        System.out.println("Кошки не плавают");     /// плавания равная 0, чтобы избежать неучтенных интервалов.
    }

    public static void count(){
        System.out.println("Кошек " + count);
    }

}