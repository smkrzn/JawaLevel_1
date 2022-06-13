package Lesson7;

public class App {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 50);
        Cat cat2 = new Cat("Мурзик",100);
        Cat cat3 = new Cat("Компот", 80);
        Cat[] cats = new Cat[]{cat1, cat2, cat3};
        Plate plate = new Plate(200);

        for (int i = 0; i < cats.length; i++){
            cats[i].info();
            cats[i].printSatiety(plate.decriesFood(cats[i].getAppetite()));
            plate.info();
        }
    }
}
