package com.ocean.learning.helloWorld;

public class BinarySearch {

    public static void binarySearch(int arr[], int target){
        int startIndex = 0;
        int lastIndex = arr.length -1;
        while (startIndex <= lastIndex){
            int mid = (startIndex+lastIndex)/2;
            if(arr[mid] < target){
                startIndex = mid +1;
            }
            else if (arr[mid] == target){
                System.out.println("Element found");
                System.out.println("Cieling & Floor Number is : " + arr[mid]);
                break;
            }
            else {
                lastIndex = mid - 1;
            }
        }
        if (startIndex > lastIndex){
            System.out.println("Element Not found");
            System.out.println("Floor Number is : " + arr[lastIndex]);
            System.out.println("Cieling number is : " + arr[startIndex]);
        }
    }

    public static void charSearch(char chr[], char key){
        int start = 0;
        int last = chr.length -1;
        while (start<=last){
            int mid = (start+last)/2;
            if(chr[mid] < key){
                start = mid+1;
            }
            else if (chr[mid] > key){
                last = mid-1;
            }
            else {
                if (mid == chr.length-1) {
                    System.out.println("Next element is : " + chr[0]);
                }
                else {
                    System.out.println("Next element is : " + chr[mid + 1]);
                }
                break;
            }
        }
    }
}
