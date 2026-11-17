package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SelectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> inputList = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = inputList.size();
        int left = 0, right = n-1;
        while(left<right){
            int minIdx = left;
            for(int i = left; i<=right; i++){
                if(inputList.get(i)<inputList.get(minIdx)){
                    minIdx = i;
                }
            }
            int temp = inputList.get(left);
            inputList.set(left, inputList.get(minIdx));
            inputList.set(minIdx,temp);
            left++;
        }
        System.out.println(inputList);
    }
}
