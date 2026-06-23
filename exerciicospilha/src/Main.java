import blocoa.Questao1_StackComDuasFilas.QueueBasedStack;
import blocoa.Questao2_EnsureCapacity.ArrayStack;
import blocoa.Questao3_DualStack.DualStack;
import blocob.Questao4_LinkedStackPush.LinkedStack;
import blocob.Questao5_RemoveElement.StackOperations;
import blocob.Questao6_Palindromo.PalindromeChecker;

public class Main {

    public static void main(String[] args) {
        demonstrateQueueBasedStack();
        demonstrateArrayStack();
        demonstrateDualStack();
        demonstrateLinkedStack();
        demonstrateRemoveElement();
        demonstratePalindromeChecker();
    }

    private static void demonstrateQueueBasedStack() {
        System.out.println("=== QUESTAO 1: Pilha com Duas Filas ===");
        QueueBasedStack<Integer> stack = new QueueBasedStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Topo: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Vazia? " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Vazia? " + stack.isEmpty());
        System.out.println();
    }

    private static void demonstrateArrayStack() {
        System.out.println("=== QUESTAO 2: ArrayStack com ensureCapacity ===");
        ArrayStack<String> stack = new ArrayStack<>(3);
        System.out.println("Capacidade inicial: " + stack.capacity());
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Capacidade antes do 4o push: " + stack.capacity());
        stack.push("D");
        System.out.println("Capacidade apos redimensionamento: " + stack.capacity());
        System.out.println("Topo: " + stack.top());
        System.out.println("Tamanho: " + stack.size());
        System.out.println();
    }

    private static void demonstrateDualStack() {
        System.out.println("=== QUESTAO 3: DualStack ===");
        DualStack dual = new DualStack(6);
        dual.pushA(1);
        dual.pushA(2);
        dual.pushA(3);
        dual.pushB(9);
        dual.pushB(8);
        dual.pushB(7);
        System.out.println("Topo A: " + dual.topA());
        System.out.println("Topo B: " + dual.topB());
        System.out.println("Tamanho A: " + dual.sizeA());
        System.out.println("Tamanho B: " + dual.sizeB());

        try {
            dual.pushA(99);
        } catch (StackOverflowError e) {
            System.out.println("Overflow detectado: " + e.getMessage());
        }
        System.out.println();
    }

    private static void demonstrateLinkedStack() {
        System.out.println("=== QUESTAO 4: LinkedStack Push O(1) ===");
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Base");
        stack.push("Meio");
        stack.push("Topo");
        System.out.println("Topo: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Novo Topo: " + stack.top());
        System.out.println("Tamanho: " + stack.size());
        System.out.println();
    }

    private static void demonstrateRemoveElement() {
        System.out.println("=== QUESTAO 5: removeElement ===");
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Topo antes: " + stack.top());
        boolean removed = StackOperations.removeElement(stack, 20);
        System.out.println("Removeu 20? " + removed);
        System.out.println("Topo depois: " + stack.top());
        System.out.print("Ordem apos remocao: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n");
    }

    private static void demonstratePalindromeChecker() {
        System.out.println("=== QUESTAO 6: Palindromo ===");
        String[] tests = {"arara", "Java", "A man a plan a canal Panama", "OpenAI"};
        for (String test : tests) {
            System.out.println("\"" + test + "\" -> " + PalindromeChecker.isPalindrome(test));
        }
    }
}
