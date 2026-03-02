package Session15.Ex3;

import java.util.Stack;

public class MedicationProcessChecker {
    Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    public void checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equals("PUSH")) {
                stack.push(action);
            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Error Stack empty");
                }
            } else {
                System.out.println(" Hành động không hợp lệ tại bước "
                        + (i + 1) + ": " + action);
                return;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực nhưng vẫn còn "
                    + stack.size() + " thao tác chưa hoàn tất.");
            return;
        }

        System.out.println("✅ Quy trình hợp lệ.");
    }

    public void reset() {
        stack.clear();
    }


}
