import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 70) {
            System.out.println("B");
        }
        else if (score >= 50) {
            System.out.println("C");
        }
        else if (score >= 35) {
            System.out.println("D");
        }
        else{
            System.out.println("fail");
        }
    }
}

//If-else statements are often the preferred choice for scenarios where the conditions are not easily enumerable or
// where you need to execute different blocks of code based on various conditions.