// Code for Check if Leap Year or not 

import java.util.Scanner;

public class LeapYearornot {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Input No: ");
    int n = sc.nextInt();
    int count = 0;

    // Method 1
    // for(int i = 1; i < n+1; i++){
    //     if(n % i == 0){
    //         count += 1;
    //     }
    // }
    // // System.out.println(count);
    // if(count > 2){
    //     System.out.println("Given No. is not a prime Number " + n);
    // }else{
    //     System.out.println("Given No. is Prime Numbers " + n);
    // }

     // Method 2
     for(int i = 1; i < n +1; i++){
        if(n % i == 0){
            count += 1;
        }
     }
     if(n == 0 || n == 1){
        System.out.println("Given No. is Not Prime No " +n);
    }else if(count > 2){
        System.out.println("Given No. is Not Prime No " +n);
    }else{
         System.out.println("Given No. is Prime No " +n);
     }
    
    // Method 3
//     boolean isPrime = true;
//     if (n < 2) {
//         isPrime = false;
//     } else {
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//     }

//     if (isPrime) {
//         System.out.println("Number is a Prime Number");
//     } else {
//         System.out.println("Number is not a Prime Number");
//     }

// Method 4
// boolean isPrime = true;
// if (n < 2) {
//     isPrime = false;
// } else {
//     int x = n / 2;
//     for (int i = 2; i <= x; i++) {
//         if (n % i == 0) {
//             isPrime = false;
//             break;
//         }
//     }
// }

// if (isPrime) {
//     System.out.println("Number is a Prime Number");
// } else {
//     System.out.println("Number is not a Prime Number");
// }
}
}

