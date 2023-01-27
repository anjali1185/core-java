package Assignment_3;

//Swap elements of Java ArrayList At the each definedindex
//Before swaping, ArrayList contains : [A, B, C, D, E]
//After swaping, ArrayList contains : [E, B, C, D, A]

import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.next());
        }
        System.out.println(arr);
        for(int i=0;i<n/2;i++){
            Collections.swap(arr,i,n-i-1);
        }
        System.out.println(arr);
    }
}
