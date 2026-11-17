package basics;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class switchCaseEx {
    public static void main(String[] args) {
        System.out.print("Enter a number between 1 and 7: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        switch(inputNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
//switch statements shine when you have a single variable to compare against multiple distinct values

//always break once the right code is executed to exit the switch block and write a defualt to handle outliers
