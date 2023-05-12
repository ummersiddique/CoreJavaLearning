package org.example;

public class Main {
    public static void main(String[] args) {
        calculateSum(12, 23);
        calculateSum(123, 23, 23, 23, 23, 23, 23, 23, 123);

        var array = new int[]{12, 32, 23, 23, 43, 5};
        int index = findElement(array, 5);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at : " + index);
        }

        var first = "Demo";
        var second = "Demo";
        System.out.println("Both strings are equal : " + areEqual(first, second));

        System.out.println("String contains : " + contains("This is the input", "the"));
    }

    private static boolean contains(String input, String stringToFind) {
        return input.contains(stringToFind);
    }

    private static boolean areEqual(String first, String second) {
        return first.equals(second);
    }

    private static int findElement(int[] array, int element) {
        if (array != null) {
            for (int index = 0; index < array.length; index++) {
                var number = array[index];
                if (number == element)
                    return index;
            }
        }
        return -1;
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