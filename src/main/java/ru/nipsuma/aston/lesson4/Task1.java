package ru.nipsuma.aston.lesson4;

public class Task1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(checkOfInterval(5,6));
        checkOfPositive(5);
        System.out.println(checkOfNegative(5));
        printString("ksjhdfksdhj", 5);
        System.out.println(checkYearLeap(2024));
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 3;
        int b = 5;
        int c = a + b;
        if (c > 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 40;
        if (value <= 0) {
            System.out.printf("Красный");
        }
        else if (0<value || value<=100) {
            System.out.printf("Желтый");
        }
        else if (value>100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean checkOfInterval(int a, int b) {
        int c = a + b;
        if (c>=10 || c>=20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void checkOfPositive(int a) {
        if (a>= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean checkOfNegative(int a) {
        if (a >= 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean checkYearLeap(int a) {
        if (a % 400 == 0) {
            return true; //високосный366
        }
        else if (a % 100 == 0) {
            return false; //невисокосный365
        }
        else return false;
    }

    public static void task9() {
        int [] arr = new int[] {1,0,1,0,1};
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                continue;
            }
            if (arr[i] == 1) {
                arr[i] = 0;

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void task10() {
        int [] arr = new int[] {1,0,1,0,1};
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                continue;
            }
            if (arr[i] == 1) {
                arr[i] = 0;

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void task11() {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void task12() {
        int [] arr = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void task13() {
        int [] [] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==j) {
                    table[i][j] = 1;
                }

            }

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    private static void task14() {
        int [] arr = createArray(5,7);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int [] createArray(int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
