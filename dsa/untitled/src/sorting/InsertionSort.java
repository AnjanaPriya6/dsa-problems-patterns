package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = list.size();
        int pointer = 1;
        int temp = 0;
        int tpointer = 0;
        while (pointer < n) {
            temp = list.get(pointer);
            tpointer = pointer - 1;
            while (tpointer>=0 && temp < list.get(tpointer)) {
                list.set(tpointer + 1, list.get(tpointer));
                tpointer--;
            }
            list.set(tpointer+1, temp);
            pointer++;
        }
        System.out.println(list);
    }
}
