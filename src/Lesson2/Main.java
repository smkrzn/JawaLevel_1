package Lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1 = -5;            ///Число для заданий 1,2 и 3
        int num2 = 5;             ///Число для задания 1
        numbers1(num1, num2);
        //System.out.println(numbers1(num1, num2));  /// Проверка метода
        numbers2(num1);
        numbers3(num1);
        //System.out.println(numbers3(num1)); /// Проверка метода
        String text = "Hello!!!";      ///Задание 4 текст
        int iter = 3;                  ///Задание 4 количество повторений
        lines(iter, text);
        int years = 400;
        years(years);
        /*if (years(years)){                        /// Проверка метода
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }*/

    }

    public static boolean numbers1(int nam1,int nam2){   //Первое задание
        boolean result = false;
        if ((nam1 + nam2) <= 20 && (nam1 + nam2) >= 10){
            result = true;
        }
        return result;

    }

    public static void numbers2 (int num1){         /// Второе задание
        if ( num1 < 0){
            System.out.println("Число отрицательное!");
        } else {
            System.out.println("Число положительное!");
        }
    }

    public static boolean numbers3(int num1){       ///Третье задание
        boolean result = false;
        if ( num1 < 0){
            result = true;
        }
        return result;
    }

    public static void lines(int iter, String text){     ///Четвертое задание
        for ( int i = 1; i <= iter; i++) {
            System.out.println(text);
        }
    }

    public static boolean years( int years){     ///Пятое задание
        boolean result = true;
        if ((years % 4) == 0) {
            if ((years % 100) == 0 && (years % 400 != 0)){
                result = false;
            }
        } else {
            result = false;
        }
        return result;

    }

}
