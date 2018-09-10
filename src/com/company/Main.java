package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the numbers");
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();

        System.out.println("Display sort number: ");
        sort(num1, num2, num3);
    }

    public static void displaySortedNumbers( double num1, double num2, double num3){
        System.out.println(num1 + " " + num2 + " " + num3);
    }

    public static void sort(double num1, double num2, double num3){
        double[] array = new double[3];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;

        array = selectionSort(array);

        displaySortedNumbers(array[0], array[1], array[2]);
    }

    public static double[] selectionSort(double[] array)
    {
        int i, j, max;

        // One by one move boundary of unsorted subarray
        for (i = 0; i < array.length; i++)
        {
            // Find the minimum element in unsorted array
            max = i;
            for (j = i+1; j < array.length; j++) {
                if (array[j] > array[max])
                    max = j;
            }
            // Swap the found minimum element with the first element
            double temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }

        return array;
    }

}
