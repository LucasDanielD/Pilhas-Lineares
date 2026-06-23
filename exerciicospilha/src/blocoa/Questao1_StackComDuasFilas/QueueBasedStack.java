package blocoa.Questao1_StackComDuasFilas;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueBasedStack<T> {

    private Queue<T> primary;
    private Queue<T> auxiliary;

    public QueueBasedStack() {
        this.primary = new LinkedList<>();
        this.auxiliary = new LinkedList<>();
    }

    public void push(T element) {
        auxiliary.add(element);
        while (!primary.isEmpty()) {
            auxiliary.add(primary.remove());
        }
        Queue<T> temp = primary;
        primary = auxiliary;
        auxiliary = temp;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return primary.remove();
    }

    public T top() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return primary.peek();
    }

    public boolean isEmpty() {
        return primary.isEmpty();
    }

    public int size() {
        return primary.size();
    }
}
