package lesson01.online;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HW2 {
    public static void main(String[] args) {
        // write your code here

        int[] MyArray = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] arrayInt2 = new int[8];
        int[] MyArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] MyArray4 = {5, 5, 3, 2, 11, 4, 5, 1, 4, 8, 9};
        int[][] MyArray5 = new int[5][5];
        int[] MyArray6 = {5, 5, 5, 3, 8, 4};
        writeArray(MyArray);
        System.out.println(Arrays.toString(MyArray));

        write2Array(arrayInt2);
        System.out.println(Arrays.toString(arrayInt2));

        write3Array(MyArray3);
        System.out.println(Arrays.toString(MyArray3));

        write4Array(MyArray4);

        write5Array(MyArray5);
        write6Array(MyArray6);

    }

    public static void writeArray(int[] inputArray) { //Task 1
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                inputArray[i] = 1;
            } else {
                inputArray[i] = 0;
            }
        }
    }
    public static void write2Array(int[] input2Array) {
        int a = 0;
        for (int i = 0; i < input2Array.length; i++) {
            input2Array[i] = 1 + a;
            a = a + 3;

        }
    }

    public static void write3Array(int[] input3Array) { //Task 3
        for (int i = 0; i < input3Array.length; i++) {
            if (input3Array[i] < 6) {
                input3Array[i] = input3Array[i] * 2;
            }
        }
    }

    public static void write4Array(int[] input4Array) { //Task 4
        Arrays.sort(input4Array);
        System.out.println(input4Array[0]);
        System.out.println(input4Array[10]);
    }

    public static void write5Array(int[][] input5Array) { //Task 5
        int column = 4;
        for (int i = 0; i < input5Array.length; i++) {
            input5Array[i][i] = 1;
        }
        System.out.println();
        for (int j = 0; j < input5Array.length; j++) {
            input5Array[j][column] = 1;
            column--;
        }
        for (int i = 0; i < input5Array.length; i++) {
            System.out.println();
            for (int j = 0; j < input5Array.length; j++) {
                System.out.print(input5Array[i][j]+ " ");
            }
        }
    }

    public static void write6Array(int[] input6Array) { //Task 6
        int sum = IntStream.of(input6Array).sum();
        //sum = sum / 2;
        int a = 0;
        int arrsum = sum / 2;
        boolean f = false;

        if ((float) sum %2 == 0){

            for (int i=0; i<input6Array.length; i++) {
                a = a + input6Array[i] ;
                if (a == arrsum){
                    f = true;
                }
            }
        }
        System.out.println("\n" + f);


    }
    /*public static void main(String[] args) {


        int[] arrayInt2 = new int[8];

                write2Array(arrayInt2);
        System.out.println(Arrays.toString(arrayInt2));

    }

    public static void write2Array(int[] input2Array) {
        int a = 0;
        for (int i = 0; i < input2Array.length; i++) {
            input2Array[i] = 1 + a;
            a = a + 3;

        }
    }*/



    }




