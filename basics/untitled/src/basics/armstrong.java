package basics;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int length = String.valueOf(n).length();
        int sum = 0;
        while(n>0){
           int lastDigit = n%10;
           sum = (int) (sum+Math.pow(lastDigit,length));
           n = n/10;
        }
        System.out.println(temp == sum);
    }
}
