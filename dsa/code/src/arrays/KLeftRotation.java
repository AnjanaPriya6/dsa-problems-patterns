package arrays;

public class KLeftRotation {
    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        int k = 2;


    }

    public int[] reverse(int[]input, int start, int end){
        int temp;
        while(start<end){
            temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }
    
}
