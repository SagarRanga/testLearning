package com.ocean.learning.helloWorld;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
        int k = 3;
        Integer[] init3 = {1, 23, 12, 9, 30, 2, 50};
        kLargestElement(init3, k);
        boolean result2 = isIsogram("moOse");
        String result1 = disemvowel("This website is for losers LOL!");
        int solution = century(1705);
        boolean result = zeroFuel(100, 50, 1);
        int[] init2 = {};
        getSum(init2);
        getSequenceNumber();
        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(feast("chickadee", "chocolate cake"));
        System.out.println(feast("brown bear", "bear claw"));
        int[] init = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        countPositivesSumNegatives(init);
        int[] init1 = {};
        countPositivesSumNegatives(init1);
    }

    private static void kLargestElement(Integer[] init2, int k) {
        Arrays.sort(init2, Collections.reverseOrder());
        for (int i = 0; i<k; i++){
            System.out.println(init2[i]);
        }
    }

    public static boolean  isIsogram(String str) {
        char[] strArray = str.toLowerCase().toCharArray();
        Arrays.sort(strArray);
        for(int i=0; i<str.length()-1; i++){
            if (strArray[i] == strArray[i+1]){
                return false;
            }
        }
        return true;
    }

    public static String disemvowel(String str) {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'U'
            ){
                continue;
            }
            else {
                output.append(str.charAt(i));
            }
        }
        return String.valueOf(output);
    }

    public static String solution(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        return String.valueOf(input.reverse());
    }

    public static int century(int number) {
        double result = (number/100);
        return ((number/100) > 0) ? (int)  (result + 1) : (int) result;
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return ((mpg * fuelLeft)>= distanceToPump) ? true : false;
    }

    public static int getSum(int[] numbers) {
        if (numbers == null) {
            return 0;
        } else {
            Arrays.sort(numbers);
            int arrayLength = numbers.length;
            if (arrayLength > 0) {
                int j = 0;
                for (int i = 1; i < (arrayLength - 1); i++) {
                    j += numbers[i];
                }
                return j;
            } else
                return 0;
        }
    }

    public static boolean feast(String beast, String dish) {
        return ((beast.charAt(0) == dish.charAt(0)) && (beast.charAt(beast.length() - 1) == (dish.charAt(dish.length() - 1))));
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        int count = 0;
        int sumNegatives =0;
        if (input.length > 0 && !(input == null)) {
            for (int i : input) {
                if (i >= 0) {
                    count += 1;
                } else {
                    sumNegatives += i;
                }
            }
        }
        return new int[]{count, sumNegatives};
    }

    public static int getSequenceNumber(){
        int i = 1;
        int j = 0;
        while (i<=5)
        {
            j += i;
            i++;
        }
        return j;
    }

}
