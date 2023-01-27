package Assignment_3;

//Create an ArrayList and search (if it is present or not )that element and tells the index. tell me if the elements is duplicate tell me the first and last occurance of that element

import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.print("Enter the key to find : ");
        int key = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(key == arr.get(i)){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Element is not present");
        }else if(count == 1){
            System.out.println("Element is present only once");
        }else{
            System.out.println("First key at : "+arr.indexOf(key));
            System.out.println("Last key at : "+arr.lastIndexOf(key));
        }
    }
}
