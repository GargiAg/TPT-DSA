//input-{2,7,1,13,6,9,2} output-{{2,7},{7,13}, {1,6}, {6,9}, {9,-1},{2,-1}}//
import java.util.Stack;

public class nextGreatestElement {
    public static void main(String[] args) {
        int arr[] = {2, 7, 1, 13, 6, 9, 2};
        System.out.println(arr[0]);
        Stack<Integer> st = new Stack<>();
        // st.push(arr[0]);
        System.out.println(st);
        for(int i=1; i<arr.length; i++){
            int check = arr[i-1];
            
            for(int j=i; j<arr.length; j++){
                st.push(arr[j-1]);
                if(st.peek()>check){
                    System.out.println(check + "," + st.peek());
                    st.pop();
                    break;
                }

                if(st.peek()==arr[arr.length-1]){
                    System.out.println(check + " -1");
                }
            }
            

            
        }
        System.out.println(st);
    } 
}
