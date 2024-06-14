/**
 * reverseOrder
 */
public class reverseOrder {
    public static void main(String[] args) {
        int N = 10;

        // approach 1
        // for(int i = N; i > 0; i--){
        //     System.out.print(" "+i);
        // }

        // approach 2
        int i = N;
        while (i > 0) {
            System.out.print(" "+i);
            i--;
        }
    }
}