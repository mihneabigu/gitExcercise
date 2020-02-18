package com.endava.mihneabigu.gitexcercise;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
    }

    public static Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static Integer multiply(Integer a, Integer b) {
        Integer product = 0;

        for (int i = 0; i < b; i++) {
            product += a;
        }

        return product;
    }
}
