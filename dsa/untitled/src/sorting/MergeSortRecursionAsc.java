package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeSortRecursionAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        mergeSort(list, 0, list.size() - 1);
        System.out.println(list);
    }

    public static void mergeSort(List<Integer> list, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(list, left, mid);
        mergeSort(list, mid + 1, right);
        merge(list, left, mid, right);
    }

    public static void merge(List<Integer> list, int left, int mid, int right) {
        List<Integer> temp = new ArrayList<>();
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (list.get(i) <= list.get(j)) {
                temp.add(list.get(i++));
            } else {
                temp.add(list.get(j++));
            }
        }
        while (i <= mid) temp.add(list.get(i++));
        while (j <= right) temp.add(list.get(j++));

        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
    }
}
