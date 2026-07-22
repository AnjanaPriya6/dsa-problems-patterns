package basics;

import java.util.Scanner;

public class whileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<50){
            if(i%10 == n){
                j++;
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
