package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondSmallestAndLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] inputArray = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(findArr(inputArray)));
    }

    public static int[] findArr(int[] inputArray){
        int[] outputArray = new int[2];
        int smallest = Integer.MAX_VALUE, smaller = Integer.MAX_VALUE, largest = 0, larger = 0;
        for(int number: inputArray){
            if(number<smallest){
                smaller = smallest;
                smallest = number;
            }
            else if (number<smaller){
                smaller = number;
            }

            if(number>largest){
                larger = largest;
                largest = number;
            }
            else if (number>larger){
                larger = number;
            }
        }
        outputArray[0] = smaller;
        outputArray[1] = larger;
        return outputArray;
    }

}
