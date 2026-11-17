import java.util.Scanner;

public class countDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 0){
            System.out.println(1);
            return;
        }
        while(n%10>0){
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}