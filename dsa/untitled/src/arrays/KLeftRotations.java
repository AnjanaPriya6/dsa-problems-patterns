package arrays;

import java.util.Arrays;

public class KLeftRotations {
    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        int k = 2;
        reverse(input, 0, k);
        reverse(input, k+1, input.length-1);
        reverse(input, 0, input.length-1);
        System.out.println(Arrays.toString(input));
    }

    public static void reverse(int[] input, int start, int end){
        int temp;
        while(start<end){
            temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}
