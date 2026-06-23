package blocob.Questao4_LinkedStackPush;

import java.util.NoSuchElementException;

public class LinkedStack<T> {

    private Node<T> top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public T top() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
