public class PrintNTimesRecursion {
    public static void main(String args[]){
        func(5);
    }
    public static void func(int n){
        System.out.println(n);
        if(n>0){
            func(n-1);
        }
        return;
    }
}
