package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class FindingTheMaxElement {
    //Optimized solution is to iterate over the list and update the max variable
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] inputArray = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(maxEle(inputArray));
    }

    public static int maxEle(int[] inputArray){
        int max = 0;
        for(int number:inputArray){
            if(number>max){
                max = number;
            }
        }
        return max;
    }
}

//one idea is to sort the array and printing the first element of that sorted array. Min is O(nlogn) - MergeSort

//"Why does Java use quicksort for primitives but merge sort for objects?"
//
//Answer: primitives don't have identity — two int values of 5 are identical, so stability doesn't matter,
//and quicksort's cache efficiency wins.
//Objects have identity — two objects that compare equal might still be different objects, so stability matters,
//and merge sort guarantees that.
//Java actually uses TimSort (not pure merge sort) for objects, which is a hybrid optimized for real-world data patterns.