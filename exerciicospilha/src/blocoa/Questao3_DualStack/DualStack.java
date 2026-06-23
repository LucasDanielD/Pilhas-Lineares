package blocoa.Questao3_DualStack;

import java.util.NoSuchElementException;

public class DualStack {

    private final int[] array;
    private int topA;
    private int topB;

    public DualStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva");
        }
        this.array = new int[capacity];
        this.topA = -1;
        this.topB = capacity;
    }

    public void pushA(int x) {
        if (topA + 1 == topB) {
            throw new StackOverflowError("Estouro: as pilhas se chocaram");
        }
        array[++topA] = x;
    }

    public void pushB(int x) {
        if (topB - 1 == topA) {
            throw new StackOverflowError("Estouro: as pilhas se chocaram");
        }
        array[--topB] = x;
    }

    public int popA() {
        if (isEmptyA()) {
            throw new NoSuchElementException("Pilha A vazia");
        }
        return array[topA--];
    }

    public int popB() {
        if (isEmptyB()) {
            throw new NoSuchElementException("Pilha B vazia");
        }
        return array[topB++];
    }

    public int topA() {
        if (isEmptyA()) {
            throw new NoSuchElementException("Pilha A vazia");
        }
        return array[topA];
    }

    public int topB() {
        if (isEmptyB()) {
            throw new NoSuchElementException("Pilha B vazia");
        }
        return array[topB];
    }

    public boolean isEmptyA() {
        return topA == -1;
    }

    public boolean isEmptyB() {
        return topB == array.length;
    }

    public int sizeA() {
        return topA + 1;
    }

    public int sizeB() {
        return array.length - topB;
    }
}
