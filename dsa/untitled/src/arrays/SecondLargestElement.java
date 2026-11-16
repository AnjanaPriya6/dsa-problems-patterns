package arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] input = {-5, -2, 0, 86, -10};
        if (input.length<2){
            return;
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i: input){
            if(i>largest){
                second_largest = largest;
                largest = i;
            }
            else if ((second_largest<i) && (i<largest)){
                second_largest = i;
            }
        }
        System.out.println(second_largest);
    }
}
