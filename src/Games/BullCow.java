package Games;

import java.util.Random;

public class BullCow {


    private final static int[] nums = new int[4];
    private int[] answer = new int[4];



    static void numsComp() {                                 /// Загадывание числа
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            boolean res = true;
            place: while (res) {
                int x = random.nextInt(10);
                if (i == 0) {
                    nums[i] = x;
                    res = false;
                    continue;
                } else {
                    for (int n = 0; n < i; n++) {
                        if (x == nums[n]) {
                            continue place;
                        }
                    }
                }
                nums[i] = x;
                res = false;
            }
        }
    }

    static int [] checkNums(int[] answer, int [] num){
        int countCow = 0;
        int countBull = 0;
        for (int x = 0; x < 4; x++){
            for (int i = 0; i < 4; i++) {
                if (answer[x] == num[i] && x == i){
                    countBull++;
                } else if ((answer[x] == num[i] && x != i)) {
                    countCow++;
                }
            }
        }
        int[] result = new int[]{countCow, countBull};
        return result;
    }
   /*void check(int[] answer){
        for (int x = 0; x < answer.length; x++){
            for (int y = 0; y < nums.length; y++){
                if (answer[x] == nums[y]){
                    if (x == y){
                        countBull++;
                    } else {
                        countCow++;
                    }
                }
            }
        }
    }*/

    public int[] getNums() {
       return nums;
   }
}
