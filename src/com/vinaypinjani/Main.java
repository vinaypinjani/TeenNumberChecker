package com.vinaypinjani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }
}
