import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class MyQueue<T> {
        Stack<T> enqueueStack;
        Stack<T> dequeueStack;
        
        public MyQueue() {
            enqueueStack = new Stack<T>();
            dequeueStack = new Stack<T>();
        }
        
        public void enqueue(T data) {
            enqueueStack.push(data);
        }
        
        public T dequeue() {
            // dequeueStack empty -> get all elements from enqueueStack
            if (dequeueStack.empty()) {
                while (!enqueueStack.empty()) {
                    T tmp = enqueueStack.pop();
                    dequeueStack.push(tmp);
                }
            }
            // if both stacks are empty, this will throw EmptyStackException()
            return dequeueStack.pop();
        }
        
        public T peek() {
            // dequeueStack empty -> get all elements from enqueueStack
            if (dequeueStack.empty()) {
                while (!enqueueStack.empty()) {
                    T tmp = enqueueStack.pop();
                    dequeueStack.push(tmp);
                }
            }
            // if both stacks are empty, this will throw EmptyStackException()
            return dequeueStack.peek();
        }
    }
    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
