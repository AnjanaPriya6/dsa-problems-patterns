import java.util.Scanner;

public class forLoopEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String lineInput =  sc.nextLine();
        String[] lowHigh = lineInput.split(" ");
        int low =  Integer.parseInt(lowHigh[0]);
        int high = Integer.parseInt(lowHigh[1]);
        int sum = 0;
        for (int i = low; i<=high; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
