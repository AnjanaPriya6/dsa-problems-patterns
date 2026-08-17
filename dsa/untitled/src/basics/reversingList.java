package basics;

import java.util.*;

//inplace reversal
public class reversingList {
    //there are two ways to do it. One is using the direct syntax in java and the other is to use the two pointers
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");

        List<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(inputArray));
        //if this was a list of integers, you will have to parse each using Integer.parseInt before inserting as
        //ArrayList doesn't accept primitives. They only accept Objects and objects like Integer are pointers to the
        // actual values in the memory. Since String is not a primitive, addAll and asList combination works
        System.out.println(collectionMethod(arrayList));
        System.out.println(Arrays.toString(twoPointerMethodOnArray(inputArray))); // you cannot print array directly as that would print
        //the objectID instead. You will have to use toString method
        System.out.println(twoPointerMethodOnArrayList(arrayList));
    }

    //method 1 - Collections. Needs conversion to List<String>, doesn't accept an array
    public static List<String> collectionMethod(List<String> arrayList){
        Collections.reverse(arrayList);
        return arrayList;
    }

    //method 2 - using two pointers on an array
    public static String[] twoPointerMethodOnArray(String[] array){
        int left = 0, right = array.length-1; //[1,2,3,4,5] [8,1,2,3,4]
        while(left<right){
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    //method 3 - using two pointers on an arrayList
    public static List<String> twoPointerMethodOnArrayList(List<String> arrayList){
        int left = 0, right = arrayList.size() - 1;
        while(left<right){
            String temp = arrayList.get(left);
            arrayList.set(left,arrayList.get(right));
            arrayList.set(right, temp);
            left++;
            right--;
        }
        return arrayList;
    }
}
