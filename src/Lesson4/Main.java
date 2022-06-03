package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean sizeField = true;
        int size = 0;
        while (sizeField) {                                            /////Выбор размера поля
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер поля (3 или 5)");
            size = scanner.nextInt();
            scanner.close();
            if (size == 3 || size == 5){
                sizeField = false;
            } else {
                System.out.println("Неверный размер.");
            }
        }
        String[][] field = field(size);
        initField(field);
        boolean gameDraw = true;
        boolean gameWin = true;
        while (gameDraw && gameWin){
            field = human(field);
            initField(field);
            gameDraw = draw(field);
            gameWin = win(field);
            if (gameWin == false){
                System.out.println("Победил игрок!!!");
                break;
            }
            if (gameDraw == false){
                System.out.println("Ничья!!!");
                break;
            }
            field = comp(field);
            initField(field);
            gameDraw = draw(field);
            gameWin = win(field);
            if (gameWin == false){
                System.out.println("Победил компьютер!!!");
                break;
            }
            if (gameDraw == false) {
                System.out.println("Ничья!!!");
            }
        }

    }

    public static String[][] field(int size){               ///Создание начального массива
        String[][] res = new String[size][size];
        for (int i = 0; i < size; i++){
            for (int y = 0; y < size; y++){
                res[i][y] = "*";
            }
        }
        return res;
    }


    public static void initField (String[][] field){      ////Отрисовка поля
        for (int i = 0; i < field.length; i++) {
            for (int y = 0; y < field.length; y++) {
                System.out.print(field[i][y] + "  ");
            }
            System.out.println();
        }
    }

    public static String[][] human (String [][] field){       /// Ход игрока
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("Введите координаты ячейки (строка столбец):");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            scanner.close();
            int size = field.length;
            if (x < 0 || (x + 1) > size || y < 0 || (y + 1) > size) {
                System.out.println("Вы ввели непревильные координаты.");
            } else if ( field[x][y] != "*"){
                System.out.println("Ячейка занята.");
            } else {
                field[x][y] = "X";
                check = false;
            }
        }
        return field;
    }

    public static String[][] comp(String [][] field){       //// Ход компьютера
        int size = field.length;
        Random random = new Random();
        boolean freeCell = true;
        while (freeCell) {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            if (field[x][y] == "*") {
                System.out.println("Компьютер сходил в координаты." + (x + 1) + " " + (y + 1));
                field[x][y] = "O";
                ///freeCell = false;
                break;
            }
        }
        return field;
    }

    public static boolean draw(String [][] field){       ////Проверка на ничью
        boolean res = false;
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field.length; y++) {
                if (field[x][y] == "*") {
                    res = true;
                    break;
                }
            }
            if (res == true) {
                break;
            }
        }
        return res;
    }

    public static boolean win(String [][] field) {                      ////Проверка на победу
        boolean res = true;
        int point = 0;
        if (field.length == 3){
            point = 3;
        } else {
            point =4;
        }
        while (res){
            for (int ii = 0; ii <= 1; ii++) {              ///Проверка строк и толбцов
                int x = 0;
                int y = 0;
                String i = "*";
                for (int n = 0; n < field.length; n++) {
                    if (ii == 0){
                        x = n;
                        i = field[x][1];
                    } else {
                        y = n;
                        i = field[1][y];
                    }
                    int checkPoint = 0;
                    for (int k = 0; k < field.length; k++) {
                        if (ii == 0){
                            y = k;
                        } else {
                            x = k;
                        }
                        if ((field.length - k) >= (point - checkPoint) && i == field[x][y] && i != "*") {
                                checkPoint++;
                                if (checkPoint == point) {
                                    res = false;
                                    break;
                                }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (res == false) {
                break;
            }

            for (int ii = 0; ii < 2; ii++) {              ///Проверка диагоналей (ii - вариант направления диагонали)
                int x = 0;
                int y = 0;
                String i = "*";
                for (int a = -1; a <= 1; a++) {
                    int checkPoint = 0;
                    for (int n = 1; n <= field.length; n++) {
                       // int checkPoint = 0;
                        if (a == 0) {
                            if (ii == 0) {
                                x = (n - 1);
                                y = x;
                                i = field[1][1];
                            } else {
                                x = (field.length - n);
                                y = (n - 1);
                                i = field[field.length - 1][0];
                            }

                            if (field[x][y] == i && (field.length - n + 1) >= (point - checkPoint) && i == field[x][y] && i != "*") {
                                checkPoint++;
                                if (checkPoint == point) {
                                    res = false;
                                }
                            }
                        } else if (point == 3 || n > 4) {
                            break;
                        } else if (ii == 0) {
                            if (a < 0) {
                                x = (n - 1);
                                y = n;
                                i = field[0][1];
                            } else {
                                x = n;
                                y = (n - 1);
                                i = field[1][0];
                            }
                        } else {
                            if (a < 0) {
                                x = (field.length - n);
                                y = (n);
                                i = field[4][1];
                            } else {
                                x = (field.length - n - 1);
                                y = (n - 1);
                                i = field[3][0];
                            }
                            if (field[x][y] == i && (field.length - n) >= (point - checkPoint) && i == field[x][y] && i != "*") {
                                checkPoint++;
                                if (checkPoint == point) {
                                    res = false;
                                    break;
                                }
                            }
                        }

                    }
                }
            }
            break;
        }
        return res;
    }

}

