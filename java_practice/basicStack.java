import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //push 7 elements into stack
        for(int i=1;i<=7;i++){
            stack.push(i);
        }
        
        for(int i=0; i<2; i++){
            stack.pop();
        }

        System.out.println(stack.peek());

    }
}
