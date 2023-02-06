package org.campus02.calculator;

class Calculator {

    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        System.out.println(add(a,b));
        System.out.println(subract(a,b));
        System.out.println(multiply(a,b));

    }



    public static int add(int a, int b){
        int result = a + b;
        return result;
    }

    public static int subract ( int a, int b){
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}
