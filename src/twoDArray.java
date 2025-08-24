import java.util.*;

public class twoDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Size: ");
        int n =s.nextInt();

        int[][] arr = new int[n][n];

        for(int row=0;row<n;row++) {
            for(int col=0;col<n;col++) {
                arr[row][col] = s.nextInt();
            }
        }

        // Method1

//        for(int row=0;row<n;row++) {
//            for(int col=0;col<n;col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //Method2
            for(int row=0; row<n; row++) {
                System.out.println(Arrays.toString(arr[row]));
            }
    }
}
