package Assignment_3;

//Check if given Parentheses expression is balanced or not
//Input: str = “((()))()()”
//Output: Balanced
//Input: str = “())((())”
//Output: Not Balanced

import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stck = new Stack<>();
        System.out.print("Enter the pattern on in form of ')' or '(' : ");
        String pattern = sc.next();
        int n = pattern.length();
        if(pattern.charAt(0) == ')'){
            System.out.println("Not balanced");
        }else{
            for(int i=0;i<n;i++){
                if(pattern.charAt(i) == '('){
                    stck.push('(');
                }else if(pattern.charAt(i) == ')' && !stck.isEmpty()){
                    stck.pop();
                }else{
                    System.out.println("Not balanced");
                    return;
                }
            }
        }
        if(stck.isEmpty()){
            System.out.println("balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}
