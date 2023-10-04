package com.study.run.Exercise_1004;

public class SamDan {
    public static void main(String[] args) {

        int dan = 3;
        for (int i = 1; i <= 9; i++){
            System.out.printf("%2d / %2d = %4.2f", dan, i, (float)dan/i);
            System.out.println();
        }

    }

}
