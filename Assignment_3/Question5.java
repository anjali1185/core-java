package Assignment_3;

//Reverse a stack using recursion

import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stck = new Stack<>();
        System.out.print("No. of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the stack : ");
        for(int i=0;i<n;i++){
            stck.push(sc.next().charAt(0));
        }
        System.out.println("Original stack : "+stck);

    }
}
