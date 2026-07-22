import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrtN = (int) Math.sqrt(n);
        int d = 1;
        List<Integer> list = new ArrayList<>();
        while(d<=sqrtN){
            if(n%d==0){
                list.add(d);
                if(d!=n/d) {
                    list.add(n / d);
                }
            }
            d++;
        }
        System.out.println(list);
    }
}
