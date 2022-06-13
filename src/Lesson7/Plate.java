package Lesson7;

import java.util.Scanner;

public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;
    }

    public boolean decriesFood(int appetite){
        while (true) {
            if (food < appetite){
                System.out.println("В тарелке не хватает " + (appetite - food) + " еды");
                addFood(false);
                //return false;
            } else {
                food -= appetite;
                break;
            }
        }
        return true;
    }

    public void addFood(boolean satiety){
        if (satiety){
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Сколько добавить еды?");
            int add = scanner.nextInt();
            food += add;
        }
    }


    public void info(){
        System.out.println("В тарелке осталось " + food + " еды.");
    }

}
