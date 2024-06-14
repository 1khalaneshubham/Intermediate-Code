import java.util.Scanner;

public class NoPalindromeOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No: ");
        int input = sc.nextInt();
        int rem;
        int ReverseNo = 0;

        int temp = input;
        while (temp != 0) {
            rem = temp % 10;
            ReverseNo = ReverseNo * 10 + rem;
            temp = temp / 10; 
        }

        if(input == ReverseNo){
            System.out.println("Given No. is Palindrome No.");
        }else{
            System.out.println("Given No is Not Palindrome No");
        }
    }
}
