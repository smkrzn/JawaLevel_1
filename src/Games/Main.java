package Games;

public class Main {
    public static void main(String[] args) {
        //new Window();
        BullCow comp = new BullCow();
        comp.numsComp();     /// создание загаданного числа
        boolean win = true;
        int count = 0;
        while (win) {
            count++;
            int[] answer1 = Answer.answer();
            int[] result = new int[2];
            result = BullCow.checkNums(answer1, comp.getNums());
            System.out.println("Коров:" + result[0] + "   Быков:" + result[1]);
            if (result[1] == 4){
                win = false;
            }
        }
        System.out.println("Игра окончена. Попыток использовано: " + count);

    }
}
