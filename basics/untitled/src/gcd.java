import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(brute_force(a,b));
        System.out.println(efficient(a,b));
    }
    public static int brute_force(int a,int b){
        int larger = 0;
        int smaller = 0;
        int temp = 0;
        if(b>a){
            larger = b;
            smaller = a;
        }
        else{
            larger = a;
            smaller =b;
        }
        temp = smaller;
        while(!(larger%temp==0 && smaller%temp==0)){
            temp--;
        }
        return temp;
    }

    public static int efficient(int a, int b){
        int larger = 0;
        int smaller = 0;
        if(b>a){
            larger = b;
            smaller = a;
        }
        else{
            larger = a;
            smaller =b;
        }
        while(larger%smaller!=0){
            int temp = larger%smaller;
            larger = smaller;
            smaller = temp;
        }
        return smaller;
    }
}
