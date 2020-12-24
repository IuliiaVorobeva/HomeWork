package lesson01.online;

public class FirstClass {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        int a = 3;
        int b = 1;
        int c = 7;
        int d = 2;
        float e = (float) a * ((float) b + ((float) c / (float) d));
        System.out.println(e);
    }

    public static void task2() {
        int a = 5;
        int b = 16;
        int d;
        boolean c;
        d = a + b;
        if (d >= 10 && d <= 20) {
            c = true;
            System.out.println(c);
        } else {
            c = false;
            System.out.println(c);
        }
    }

    public static void task3() {
        int a = -5;

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void task4() {
        String name = "Вася";
        System.out.println("Привет " + name);
    }

    public static void task5() {
        int year = 2021;
        int years = year % 4;

        if ((years == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год невисокосный");
        }
    }
}