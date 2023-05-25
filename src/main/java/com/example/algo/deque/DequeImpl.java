package com.example.algo.deque;

import com.example.algo.stack.StackImpl;

public class DequeImpl {
    private static final int MX = 1000005;
    private static int[] dat = new int[2 * MX + 1];
    private static int head = MX, tail = MX;

    public void push_front(int x) {
        dat[--head] = x;
    }
    public void push_back(int x) {
        dat[tail++] = x;
    }
    public void pop_front() {
        head++;
    }

    public void pop_back() {
        tail--;
    }

    int front() {
        return dat[head];
    }

    public int back() {
        return dat[tail-1];
    }


    public void test() {
        push_back(30); // 30
        System.out.println(front()); // 30
        System.out.println(back()); // 30
        push_front(25); // 25 30
        push_back(12); // 25 30 12
        System.out.println(back()); // 12
        push_back(62); // 25 30 12 62
        pop_front(); // 30 12 62
        System.out.println(front()); // 30
        pop_front(); // 12 62
        System.out.println(back()); // 62
    }

    public static void main(String[] args) {
        DequeImpl deque = new DequeImpl();
        deque.test();
    }
}
