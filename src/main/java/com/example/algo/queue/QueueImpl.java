package com.example.algo.queue;

import com.example.algo.stack.StackImpl;

public class QueueImpl {
    private static final int MX = 1000005;
    private static int[] dat = new int[MX];
    private static int head = 0, tail = 0;

    public void push(int x) {
        dat[tail++] = x;
    }
    public void pop() {
        head++;
    }

    public int front() {
        return dat[head];
    }

    public int back() {
        return dat[tail-1];
    }
    public void test() {
        push(10);push(20);push(30);
        System.out.println(front());     // 10
        System.out.println(back());      // 30
        pop();pop();
        push(15);push(25);
        System.out.println(front());    // 30
        System.out.println(back());     // 25
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.test();
    }
}
