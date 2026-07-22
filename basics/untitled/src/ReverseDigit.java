import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int reversedNumber = 0;
        int counter = 1;
        if(inputNumber== 0){
            System.out.println(1);
            return;
        }
        while(inputNumber>0){
            int lastDigit = inputNumber%10;
            reversedNumber = counter+lastDigit;
            counter =  counter*10;
            inputNumber = inputNumber / 10;
        }
        System.out.println(reversedNumber);
    }
}
