// Sum of First N Natural numbers

import java.util.Scanner;

public class SumofFirstN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No: ");
        int N = sc.nextInt();

        // approach 1
        // int Sum = 0;
        // for(int i = 1; i <= N; i++){
        //     Sum = Sum+i;
        // }
        // System.out.println("Total Sum of Give No:"+Sum);

        // approach 2
        int Sum = 0; 
        int i = 1;
        while (i <= N) {
            Sum = Sum + i;
            i++;
        }
        System.out.println("Total Sum of given No: "+Sum);
    }
}
