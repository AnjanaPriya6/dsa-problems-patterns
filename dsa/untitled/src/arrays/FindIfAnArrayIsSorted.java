package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindIfAnArrayIsSorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] inputArray = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(isSorted(inputArray));
    }
    public static boolean isSorted(int[] inputArray){
        for(int i = 1; i<inputArray.length; i++){
            if(inputArray[i]<inputArray[i-1]){
                return false;
            }
        }
        return true;
    }
}
