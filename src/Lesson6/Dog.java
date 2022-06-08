package Lesson6;

public class Dog extends Animal{
    private static int count = 0;

    public Dog(int running, int swimming, String animalName, int maxSwimming, int maxRunning) {
        super(running, swimming, animalName, maxSwimming, maxRunning);
        count++;
    }

    public static void count(){
        System.out.println("Собак " + count);
    }
}
