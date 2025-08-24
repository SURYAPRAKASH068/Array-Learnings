import java.util.*;
public class Arraylistbasics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      //  System.out.println("Enter a size: ");
      //  int n =s.nextInt();

        ArrayList <Integer> list =new  ArrayList<>();

        //ArrayList basic Funtctions
        list.add(100);
        list.add(200);
        list.add(300);

        System.out.println("Original list is: "+list);

        //Check valid value or not
//        System.out.println(list.contains(200));

        //Update a vale

        list.set(0,99);
        System.out.println("Updated list is: "+list);

                   // remove the value
        list.remove(1);
        System.out.println("After romved list is: "+list);

    }
}
