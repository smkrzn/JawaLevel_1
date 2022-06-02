package Lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 0};

     //   check1(arr);                  /// Проверка задания 1
        arr = oneZero(arr);
     //   check1(arr);                 /// Проверка задания 1

        int[] arr1 = new int[100];
        arr1 = hundred(arr1);
      //  check2(arr1);                  ////Проверка задания 2

        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       // check3(num);                  ////Проверка задания 3
        num = numbers(num);
      //  check3(num);                  ////Проверка задания 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int a = scanner.nextInt();
        int[][] arr2 = new int[a][a];
        arr2 = quad(arr2);
        ///check4(arr2);                 /// Проверка задания 4

        System.out.println("Введите размер массива:");
        int len = scanner.nextInt();
       /// System.out.println("Введите содержимое массива:");
        ///String initialValue = scanner.nextLine();  /// Не могу понять почему эта строка не дает ввести данные.
        String initialValue = "МИР";
        String[] tabl = new String[len];
        tabl = arr(len,initialValue);
        ///check5(tabl);               /// Проверка задания 5

        int[] numbers = {9, 5, 6, 10, 7, 16, 85};
        int[] minMax = new int[2];
        minMax[0] = minMax(numbers)[0];
        minMax[1] = minMax(numbers)[1];
        ///System.out.println("Минимальное значение: " + minMax[0] + " Максимальное значение: " + minMax[1]);  ///Проверка задания 6

        boolean check = separation(numbers);
        System.out.println(check);

        System.out.println("Введите число для сдвига:");
        int n = scanner.nextInt();
        scanner.close();
        shift(numbers, n);
    }

    public static int[] oneZero ( int [] arr) {              ///// Задание 1
        int[] res = new int [arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            if ( arr[i] == 0){
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

    public static void check1 ( int [] arr) {       //// Проверка задания 1
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] hundred ( int [] arr1){     ///Задание 2
        int[] res = new int[arr1.length];
        for ( int i = 0 ; i < arr1.length ; i++){
            res[i] = (i + 1);
        }
        return res;
    }

    public static void check2( int [] arr1){      //// Проверка задания 2
        for (int i = 0 ; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static int[] numbers ( int [] num){     //////Задание 3
        int[] res = new int[num.length];
        for ( int i = 0; i < num.length; i++){
            if ( num[i] < 6 ){
                res[i] = num[i] * 2;
            } else {
                res[i] = num[i];
            }
        }
        return res;
    }

    public static void check3( int [] num){      //// Проверка задания 3
        for (int i = 0 ; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static int[][] quad ( int [][] arr2){      ////Задание 4
        int[][] res = new int[arr2.length][arr2.length];
        for ( int i = 0; i < arr2.length; i++){
            res[i][i] = 1;
            res[i][(arr2.length - 1 - i)] = 1;
        }
        return res;
    }

    public static void check4( int [][] arr2){       ////Проверка задания 4
        for ( int i = 0; i < arr2.length; i++){
            for ( int x = 0; x < arr2.length; x++){
                System.out.print(arr2[i][x] + "  ");
            }
            System.out.println();
        }
    }

    public static String[] arr(int len , String initialValue ){    ///Задание 5
        String[] res = new String[len];
        for (int i = 0 ; i < res.length; i++){
            res[i] = initialValue;
        }
        return res;
    }

    public static void check5( String [] tabl){
        for (int i = 0; i < tabl.length; i++) {
            System.out.print(tabl[i] + " ");
        }
        System.out.println();
    }

    public static int[] minMax ( int [] numbers){     /// Задание 6
        int[] res = new int[2];
        res[0] = numbers[0];
        res[1] = numbers[0];
        for ( int i = 0; i < numbers.length; i++){
            if (numbers[i] < res[0]){
                res[0] = numbers[i];
            } else if (numbers[i] > res[1]){
                res[1] = numbers[i];
            }
        }
        return res;
    }

    public static boolean separation( int [] numbers){      //// Задание 7
        boolean res = false;
        for ( int i = 0; i < (numbers.length - 1); i++){
            int sumLeft = 0;
            int sumRigth = 0;
            for ( int y = 0; y <= i; y++){
                sumLeft += numbers[y];
            }
            for ( int x = (i + 1); x < numbers.length; x++){
                sumRigth += numbers[x];
            }
            ///System.out.println( sumLeft + "   " + sumRigth);  //// Вывод результата подсчета
            if (sumRigth == sumLeft){
                res = true;
                break;
            }
        }

        return res;
    }

    public static void shift( int [] numbers, int n){    ////Задание 8
        int[] res = new int[numbers.length];
        for ( int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
            int x = Math.abs((n % numbers.length));
            if ( n < 0){
                if ( (i - x) < 0){
                    res[(i + numbers.length - x)] = numbers[i];
                } else {
                    res[(i - x)] = numbers[i];
                }
            } else {
                if ( (i + x) > (numbers.length - 1)){
                    res[(i - numbers.length + x)] = numbers[i];
                } else {
                    res[(i + x)] = numbers[i];
                }
            }
        }
        System.out.println();
        for ( int i = 0; i < numbers.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
