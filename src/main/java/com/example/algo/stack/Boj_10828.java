package com.example.algo.stack;

import java.io.*;
import java.util.*;

public class Boj_10828 {

    private static final int MX = 1000005;
    private static int[] dat = new int[MX];
    private static int pos = 0;

    public void push(int x) {
        dat[pos++] = x;
    }

    public int pop() {
        return empty() == 1 ? -1 : dat[--pos];
    }

    public int size() {
        return pos;
    }

    public int empty() {
        return pos == 0 ? 1 : 0;
    }

    public int top() {
        return empty() == 1 ? -1 : dat[pos - 1];
    }


    public static void main(String[] args) throws IOException {
        Boj_10828 stack = new Boj_10828();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int idx = 0; idx < n; idx++) {
            String str = br.readLine();
            switch (str) {
                case "pop":
                    bw.write(stack.pop() + "\n");

                    break;
                case "size":
                    bw.write(stack.size() + "\n");

                    break;
                case "empty":
                    bw.write(stack.empty() + "\n");

                    break;
                case "top":
                    bw.write(stack.top() + "\n");

                    break;
                default:
                    // push
                    String[] temp = str.split(" ");
                    int pushNum = Integer.parseInt(temp[1]);
                    stack.push(pushNum);
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
