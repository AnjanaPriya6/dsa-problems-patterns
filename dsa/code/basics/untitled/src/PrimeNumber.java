import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrtN = (int) Math.sqrt(n);
        int d = 2;
        while(d<=sqrtN){
            if(n%d==0){
                System.out.println(false);
                return;
            }
            d++;
        }
        System.out.println(true);
    }
}
