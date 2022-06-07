package Lesson6;

public class Animal {
    private static int count = 0;
    private String animalName;
    private int running;
    private int swimming;
    private int maxSwimming;
    private int maxRunning;

    public Animal(int running, int swimming,String animalName,int maxSwimming, int maxRunning){
        count++;
        this.running = running;
        this.swimming = swimming;
        this.animalName = animalName;
        this.maxSwimming = maxSwimming;
        this.maxRunning = maxRunning;
    }

    public void swimming(){
       if (swimming <= maxSwimming){
           System.out.println(animalName + " проплыл " + swimming + " м.");
       } else if(swimming > maxSwimming){
           System.out.println(animalName + " проплыл " + maxSwimming + " м. и устал");
       }else {
           System.out.println(animalName + " не полез в воду");
       }
    }

    public static void count(){
        System.out.println("Животных " + count);
    }
    public void running(){
       if (running <= maxRunning){
           System.out.println(animalName + " пробежал " + running + " м.");
       } else if(running > maxRunning){
           System.out.println(animalName + " пробежал " + maxRunning + " м. и устал");
       }else {
           System.out.println(animalName + " не побежал");
       }
    }

    public void setMaxSwimming(int maxSwimming) {
        this.maxSwimming = maxSwimming;
    }

    public int getMaxRunning() {
        return maxRunning;
    }

    public void setMaxRunning(int maxRunning) {
        this.maxRunning = maxRunning;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getMaxSwimming() {
        return maxSwimming;
    }
}
