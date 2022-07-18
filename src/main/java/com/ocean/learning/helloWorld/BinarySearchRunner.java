package com.ocean.learning.helloWorld;

public class BinarySearchRunner {
    public static void main(String[] args){
        int arr[] = {2,3,5,9,14,16,18};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(arr, 15);
        binarySearch.binarySearch(arr, 2);
        binarySearch.binarySearch(arr, 9);
        binarySearch.binarySearch(arr, 11);

        char chr[] = {'c','f','j'};
        BinarySearch charSearch = new BinarySearch();
        charSearch.charSearch(chr, 'c');
        charSearch.charSearch(chr, 'f');
        charSearch.charSearch(chr, 'j');

    }
}
