import java.util.*;
public class Arrayslist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int n = s.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        // to print method 1
        //  for(int i=0;i<n;i++ ){
        //     System.out.print(list.get(i)+" ");
    //}
            //method 2
            for(int i=0;i<n;i++ ) {
                System.out.println(list);
            }
        }
    }

