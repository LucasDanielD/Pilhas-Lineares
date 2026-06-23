package blocob.Questao6_Palindromo;

import java.util.LinkedList;
import java.util.Queue;

import blocob.Questao4_LinkedStackPush.LinkedStack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        LinkedStack<Character> stack = new LinkedStack<>();

        for (char c : normalized.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }
}
