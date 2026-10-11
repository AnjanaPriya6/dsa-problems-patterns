package arrays;

import java.util.*;

public class RemoveTheDuplicatesFromTheArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] inputArray = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(removeDuplicatesUnSorted(inputArray)));
        //System.out.println(Arrays.toString(removeDuplicatesSorted(inputArray)));
    }
    public static int[] removeDuplicatesUnSorted(int[] inputArray){
        Set<Integer> outputArray = new HashSet<>();
        for (int i: inputArray){
            outputArray.add(i);
        }
        return outputArray.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeDuplicatesSorted(int[] inputArray){

    }
}
