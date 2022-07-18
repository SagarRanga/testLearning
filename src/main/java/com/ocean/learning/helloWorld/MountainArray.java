package com.ocean.learning.helloWorld;

public class MountainArray {

    public static void main(String[] args){
        int arr[] = {1,2,4,5,3,1};
        int target = 4;
        peakofMountainArray(arr);
        searchMountainArray(arr, target);
    }

    private static void searchMountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start +(end - start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else
                start = mid + 1;
        }
        System.out.println("Peak element is : " + arr[start]);
        if (binarySearch(arr, target, 0, end)){
            System.out.println("Found the element in 1st array");
        } else if (binarySearch(arr, target, start, arr.length-1)){
            System.out.println("Found the element in 2nd array");
        }else {
            System.out.println("Not found");
        }
    }

    private static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start<=end){
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid+1;
            }else {
                return true;
            };
        }
        return false;
    }

    public static void peakofMountainArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            } else
                start = mid +1;
        }
        System.out.println("Peak of Array : " +arr[start]);
    }
}
