package org.example;

public class Main {
    public static void main(String[] args) {
        calculateSum(12, 23);
        calculateSum(123, 23, 23, 23, 23, 23, 23, 23, 123);
    }

    // method signature ` calculateSum(int,int) `
    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // method signature ` calculateSum(int...) `
    public static int calculateSum(int... numbers) {
        int sum = 0;
        if (numbers != null) {
            for (int number : numbers) {
                sum += number;
            }
        }
        return sum;
    }
}