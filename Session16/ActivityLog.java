package Session16;

import java.util.Stack;

public class ActivityLog<T> {
    Stack<T> stack =  new Stack<>();


    public void push(T action){
        stack.push(action);
    }

    public void undo(){
        if(stack.isEmpty()){
            System.out.println("No actions to undo.");
            return;
        }
        System.out.println("Undo: " + stack.pop());
    }

    public void ShowRecent(){
        if(stack.isEmpty()){
            System.out.println("No Recent action");
            return;
        }
        System.out.println("Last Action: " + stack.peek());
    }

}
