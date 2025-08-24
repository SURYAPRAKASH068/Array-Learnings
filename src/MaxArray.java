import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Size: ");
        int n =s.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }

        int max = 0;
        for(int i=0;i<n;i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.print("Max Element is: "+max);
}





}
