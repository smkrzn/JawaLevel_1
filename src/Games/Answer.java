package Games;

import java.util.Scanner;

public class Answer {

    public static int[] answer() {
        Scanner scanner = new Scanner(System.in);
        int numArr[] = new int[4];
        boolean ok = true;
        while (ok) {
            System.out.println("Введите число");
            String str = scanner.nextLine();
            //int numsUser = scanner.nextInt();
            //String str = Long.toString(numsUser);
            String[] numb = str.split("");
            place:
            {
                if (numb.length != 4) {
                    System.out.println("Вы ввели неправильное колличество цифр.");
                    break place;
                } else {
                    for (int i = 0; i < numb.length; i++) {
                        numArr[i] = Integer.parseInt(numb[i]);
                        for (int x = 0; x <= i; x++) {
                            if (numArr[i] == numArr[x] && i != x) {
                                System.out.println("У вас есть повторяющиеся цифры");
                                break place;
                            }
                        }
                    }
                    ok = false;
                }
            }
        }
         return numArr;

    }
}
