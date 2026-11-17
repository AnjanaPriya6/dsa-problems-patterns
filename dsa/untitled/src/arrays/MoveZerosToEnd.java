package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int[] nums = {1, 0 , 8, 3, 0, 7};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int value = 0;
        int temp;
        for(int i=0; i <= nums.length-1; i++){
            if(nums[i]!=0){
                temp = nums[i];
                nums[i] = nums[value];
                nums[value] = temp;
                value++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
