import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Size: ");
        int n =s.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
