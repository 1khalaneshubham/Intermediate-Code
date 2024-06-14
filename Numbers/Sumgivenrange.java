// Sum of numbers in a given range
import java.util.*;
public class Sumgivenrange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a No.of Range start: ");
        int N = sc.nextInt();

        System.out.print("Enter a No.of Raneg End : ");
        int End = sc.nextInt();
        
        // approach 1
        // int Sum = 0;
        // for(int i = N; i <= End; i++){
        //     Sum = Sum + i; 
        // }
        // System.out.println(" Sum of Given Range is : "+Sum);
        
        // approach 2
        // int Sum = 0;
        // int i = N;
        // while (i <= End) {
        //     Sum = Sum + i;
        //     i++;
        // }
        // System.out.println(" Sum of Given Range is : "+Sum);
    
         // approach 3
         int Sum = End*(End+1)/2-N*(N+1)/2+N;
         System.out.println("Sum of Give No.is "+Sum);
    }
}
