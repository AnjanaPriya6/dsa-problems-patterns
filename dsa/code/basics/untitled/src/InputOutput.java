import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InputOutput {
    public static void main(String[] args) {
        //input-output
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] splitSet = line.split(" ");
        String word = sc.next();
        double doubleNumber = sc.nextDouble();

        System.out.println(number);
        System.out.println(word);
        System.out.println(doubleNumber);
        System.out.println(line);
        for (String s: splitSet) {
            System.out.println(s);
        }
        sc.close();
    }
}

//String line = sc.nextLine() can only be used either as the first one in the series of inputs or only after
//clearing the buffer so the next real nextLine() call starts fresh or the /n will sit in the buffer unread

//nextLine is useful for taking inputs and later serializing them into a list for manipulation

//always close scanner to avoid resource leaks