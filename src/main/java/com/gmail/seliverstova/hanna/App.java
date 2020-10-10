package com.gmail.seliverstova.hanna;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int tmp;
        int[][] array = {
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 } };

        System.out.println("Start array:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < array.length / 2; i++) {
                for (int j = i; j < array[0].length - i - 1; j++) {
                    tmp = array[i][j];
                    array[i][j] = array[array.length - 1 - j][i];
                    array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                    array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                    array[j][array.length - 1 - i] = tmp;
                }
            }

            System.out.println(90*(k+1) + " degrees rotated array:");
            for (int[] row : array) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
