package org.example;

public class ExceptionDemo {

    public  int divide(int numerator, int denominator){
        if(denominator == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }

        return numerator/denominator;
    }
}
