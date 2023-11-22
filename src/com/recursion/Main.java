package com.recursion;

public class Main {

    public static int factorial(int number) {
        if (number == 1) return 1;
        return number * factorial(number - 1);
    }

//    Returned


//    Calling with 3
//    public static int factorial(int number) {
//        if (number == 1) return 1;
//        return number * factorial(number - 1); - > Returns 3 x 2.
//    3 x fac(3-1)
//    }

    //    Calling with 2
//    public static int factorial(int number) {
//        if (number == 1) return 1;
//        return number * factorial(number - 1);   --- Returns 2 x 1.=2
//    2 x fac(2-1)
//    }

    //    Calling with 1
//    public static int factorial(int number) {
//        if (number == 1) return 1; -     ---                 returned 1
//        return number * factorial(number - 1);
//    1 x fac(1-1)
//    }


    public static void main(String[] args) {
        int result = factorial(3);
        System.out.println(result);
    }
}
