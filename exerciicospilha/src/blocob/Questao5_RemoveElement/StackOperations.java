package blocob.Questao5_RemoveElement;

import blocob.Questao4_LinkedStackPush.LinkedStack;

public class StackOperations {

    public static <T> boolean removeElement(LinkedStack<T> stack, T target) {
        LinkedStack<T> buffer = new LinkedStack<>();
        boolean found = false;

        while (!stack.isEmpty()) {
            T current = stack.pop();
            if (!found && current.equals(target)) {
                found = true;
                continue;
            }
            buffer.push(current);
        }

        while (!buffer.isEmpty()) {
            stack.push(buffer.pop());
        }

        return found;
    }
}
