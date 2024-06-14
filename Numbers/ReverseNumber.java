import java.util.Scanner;

public class ReverseNumber {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No: ");
        int input = sc.nextInt();
        int reverse = 0;
        int rem ;

        while (input != 0) {
            rem = input % 10;
            reverse = reverse * 10 + rem;
            input = input/10;
        }
        System.out.println(reverse);
    }
}
