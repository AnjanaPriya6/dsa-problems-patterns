package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BubbleSortAsc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = list.size();
        int left=0, right = n-1, temp = 0;
        while(right>left){
            while(left<right){
                if(list.get(left)>list.get(left+1)){
                    temp = list.get(left);
                    list.set(left, list.get(left+1));
                    list.set(left+1, temp);
                }
                left++;
            }
            left = 0;
            right--;
        }
        System.out.println(list);
    }
}