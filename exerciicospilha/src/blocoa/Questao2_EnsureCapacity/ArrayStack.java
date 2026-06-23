package blocoa.Questao2_EnsureCapacity;

import java.util.NoSuchElementException;

public class ArrayStack<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private T[] elements;
    private int topIndex;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.topIndex = -1;
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva");
        }
        this.elements = (T[]) new Object[initialCapacity];
        this.topIndex = -1;
    }

    public void push(T element) {
        ensureCapacity();
        elements[++topIndex] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        T element = elements[topIndex];
        elements[topIndex--] = null;
        return element;
    }

    public T top() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return elements[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }

    public int capacity() {
        return elements.length;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (topIndex + 1 < elements.length) {
            return;
        }
        int newCapacity = elements.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}
