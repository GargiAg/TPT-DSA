import java.util.*;

public class reverseAString {
    public static void main(String[] args) {
        String str = "Hello new World";
        System.out.println(str);
        // int n = str.length();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                st.push(str.charAt(i));  // Push all characters of the string to the stack
            }    
            else {
                while(st.isEmpty()==false){
                    System.out.print(st.pop()); 
                }
                System.out.print(" ");
            }
        }
        
        //boundary condition
        while(st.isEmpty() == false) {    
            System.out.print(st.pop());
        }
    }
}