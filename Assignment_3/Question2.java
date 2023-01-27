package Assignment_3;

//Copy elements from one arraylist to another
//Output would be
//Before copy : [One, Two, Three, Four, Five]
//After copy : [1, 2, 3, Four, Five]

import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();

        System.out.print("Enter number of elements in arr1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter number of elements in arr2 : ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements in arr1 : ");
        for(int i=0;i<n1;i++){
            arr1.add(sc.next());
        }

        System.out.println("Enter elements in arr1 : ");
        for(int i=0;i<n2;i++){
            arr2.add(sc.next());
        }
        System.out.print("Enter 1 if you want to copy from arr1 to arr2 and 2 for vice versa : ");
        int response = sc.nextInt();
        if(response == 1) {
            System.out.println("Enter start index and stop index to copy");
            int start = sc.nextInt();
            int stop = sc.nextInt();
            for (int i = start; i <= stop; i++) {
                arr2.add(arr1.get(i));
            }
        }else if(response == 2){
            System.out.println("Enter start index and stop index to copy");
            int start = sc.nextInt();
            int stop = sc.nextInt();
            for(int i=start;i<=stop;i++){
                arr1.add(arr2.get(i));
            }
        }else{
            System.out.println("INVALID INPUT");
        }
        System.out.println(arr1);
        System.out.println(arr2);
    }
}
