package Hackerrank.oneweekpreparation.daythree;

import javax.swing.plaf.TableHeaderUI;
import java.util.Arrays;
import java.util.Scanner;

/*
In this challenge, the task is to debug the existing code to successfully execute all provided test files.

Given an array of  distinct integers, transform the array into a zig zag sequence by permuting the array elements. A sequence will be called a zig zag sequence if the first  elements in the sequence are in increasing order and the last  elements are in decreasing order, where . You need to find the lexicographically smallest zig zag sequence of the given array.

Example.


Now if we permute the array as , the result is a zig zag sequence.

Debug the given function findZigZagSequence to return the appropriate zig zag sequence for the given input array.

Note: You can modify at most three lines in the given code. You cannot add or remove lines of code.

To restore the original code, click on the icon to the right of the language selector.

Input Format

The first line contains  the number of test cases. The first line of each test case contains an integer , denoting the number of array elements. The next line of the test case contains  elements of array .

Constraints


 ( is always odd)

Output Format

For each test cases, print the elements of the transformed zig zag sequence in a single line.
 */
public class ZigZagSequence {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements : ");
        int test_cases = sc.nextInt();
        int[] a = new int[test_cases];
        for(int cs = 1; cs < test_cases+1 ; cs++) {
            System.out.println("Please enter element number " + cs + " : ");
            a[cs-1] = sc.nextInt();
        }
        System.out.println("Your zig zag array out put is : ");

        try {
            Thread.sleep(500);
            System.out.print("->");
            Thread.sleep(1000);
            System.out.print(" ->");
            Thread.sleep(1000);
            System.out.print(" ->\n");
            Thread.sleep(1000);
            System.out.println("Your zig zag array is : ");
            findZigZagSequence(a,test_cases);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }


    }
    public static void findZigZagSequence (int[] a, int n) {

        Arrays.sort(a);
        //middle element is always array.length/2 and this will be stored.
        int mid = (n)/2;
        //we will change middle index element to the last element of the array and last element to the middle as we already sorted the array.
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        //Arrays next half from middle should go
        int start = mid + 1;
        int end = (n - 1)-1;
        while(start <= end){
            temp = a[start];
            a[start] = a[end-1];
            a[end] = temp;
            start = start + 1;
            end = end - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();

    }
}
