package Test28;

import java.util.Scanner;
import java.util.Stack;

public class WhetherStringValid {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            System.out.println("enter the string");
    
            String str  = scan.nextLine();
    
            Stack<Character> st = new Stack<>();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                if(ch == '(' || ch == '[' || ch == '{'){
                    st.push(ch);
                }else if(ch == ')' || ch == ']' || ch == '}'){
                    while((st.peek() !='(' || st.peek() != '{' || st.peek() == '[') && st.size() != 0){

                        st.remove(st.peek());
                    }

                    st.remove(st.peek());
                }
    
    
            }
    
            if(st.size() == 0){
                System.out.println("string is valid");
                
            }else{
                System.out.println("string is not valid");
            }
            
    
    }
}
