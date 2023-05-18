package com.example.algo.queue;

import java.io.*;

public class Boj_18258 {

    /*
    첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)이 주어진다.
     둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
      문제에 나와있지 않은 명령이 주어지는 경우는 없다.
     */
    private static final int MX = 2000000;
    private static int[] dat = new int[MX];
    private static int head = 0, tail = 0;

    public void push(int x) {
        dat[tail] = x;
        tail++;
    }

    public int pop() {
        return tail - head == 0 ? -1 : dat[head++];
    }

    public int size() {
        return tail - head;
    }

    public int empty() {
        return tail - head == 0 ? 1 : 0;
    }

    public int front() {
        return tail - head == 0 ? -1 : dat[head];
    }

    public int back() {
        return tail - head == 0 ? -1 : dat[tail-1];
    }

    /*
    push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다.
만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    */

    public static void main(String[] args) throws IOException {
        Boj_18258 main = new Boj_18258();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int idx = 0; idx < n; idx++) {
            String str = br.readLine();
            switch(str) {
                case "pop":
                    bw.write(main.pop()+"\n");
                    break;
                case "size":
                    bw.write(main.size()+"\n");
                    break;
                case "empty":
                    bw.write(main.empty()+"\n");
                    break;
                case "front":
                    bw.write(main.front()+"\n");
                    break;
                case "back":
                    bw.write(main.back()+"\n");
                    break;
                default:
                    // push
                    String[] temp = str.split(" ");
                    int pushNum = Integer.parseInt(temp[1]);
                    main.push(pushNum);
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
