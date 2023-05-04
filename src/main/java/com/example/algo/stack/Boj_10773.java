package com.example.algo.stack;

import java.io.*;
import java.util.Stack;

public class Boj_10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int idx = 0; idx < n; idx++) {
            int num = Integer.parseInt(br.readLine());
            Integer integer = num != 0 ? stack.push(num) : stack.pop();
        }

        for (Integer integer : stack) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
