package com.example.algo.stack;

public class StackImpl {

    private static final int MX = 1000005;
    private static int[] dat = new int[MX];
    private static int pos = 0;

    public void push(int x) {
        dat[pos] = x;
        pos++;
    }
    public void pop() {
        if(pos > 0) pos--;
    }

    public int top() {
        return dat[pos-1];
    }

    public void test() {
        push(5); push(4); push(3);
        System.out.println(top());
        pop(); pop();
        System.out.println(top());
        push(10); push(12);
        System.out.println(top());
        pop();
        System.out.println(top());
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.test();
    }
}
