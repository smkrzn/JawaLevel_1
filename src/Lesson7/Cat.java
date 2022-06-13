package Lesson7;

public class Cat {

    private String name;
    private boolean satiety;
    private int appetite;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate){
        plate.decriesFood(appetite);
    }

    public void printSatiety(boolean satiety){
        if (satiety){
            System.out.println(name + " сыт.");
            this.satiety = satiety;
        } else {
            System.out.println(name + " голоден.");
        }
    }


    public void info(){
        System.out.println("[ " + name + " голоден на " + appetite + " ]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;

    }
}
