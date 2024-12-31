package StackAndQueues;

import java.util.*;

public class lect1 {

    private class stack {
        int[] data;
        int tos;
        int size;

        stack(int cap) {
            data = new int[cap];
            tos = -1;
            size = 0;
        }

        public void push(int val) {
            if (size == data.length) {
                System.out.println("Stack overflow");
                return;
            }
            tos++;
            data[tos] = val;
            size++;
        }

        public int pop() {
            if (size == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = data[tos];
            tos--;
            size--;
            return val;
        }

        public void peek() {
            if (size == 0) {
                System.out.println("Stack underflow");
                return;
            }
            System.out.println(data[tos]);
        }

        public int size() {
            return size;
        }
    }

    private class queue {
        int[] data;
        int size;
        int front;
        int back;

        queue(int cap) {
            data = new int[cap];
            size = 0;
            front = 0;
            back = 0;
        }

        public void add(int val) {
            if (size == data.length) {
                System.out.println("Queue overflow");
                return;
            }
            data[back] = val;
            back = (back + 1) % data.length;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue underflow");
                return -1;
            }
            int val = data[front];

            front = (front + 1) % data.length;
            size--;
            return val;
        }

        public void peek() {
            if (size == 0) {
                System.out.println("Queue underflow");
                return;
            }
            System.out.println(data[front]);
        }

        public int size() {
            return size;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode() {
            this.val = 0;
        }
    }

    private class stackLL {
        ListNode head;
        int size;

        stackLL() {
            head = null;
            size = 0;
        }

        public void push(int val) {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;
            size++;
        }

        public int pop() {
            if (size == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        public void peek() {
            if (size == 0) {
                System.out.println("Stack underflow");
                return;
            }
            System.out.println(head.val);
        }

        public int size() {
            return size;
        }
    }

    private class queueLL {
        ListNode head;
        ListNode tail;
        int size;

        queueLL() {
            head = null;
            tail = null;
            size = 0;
        }

        public void add(int val) {
            ListNode node = new ListNode(val);
            if (size == 0) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue underflow");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        public void peek() {
            if (size == 0) {
                System.out.println("Queue underflow");
                return;
            }
            System.out.println(head.val);
        }

        public int size() {
            return size;
        }
    }

    private class StackusingQueue {
        Queue<Integer> queue;

        StackusingQueue() {
            queue = new LinkedList<>();
        }

        public void push(int val) {
            queue.add(val);
            int size = queue.size();
            while (size > 1) {
                queue.add(queue.remove());
                size--;
            }
        }

        public int pop() {
            if (queue.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return queue.remove();
        }

        public void peek() {
            if (queue.size() == 0) {
                System.out.println("Stack underflow");
                return;
            }
            System.out.println(queue.peek());
        }

        public int size() {
            return queue.size();
        }
    }

    private class QueueusingStack {

        Stack<Integer> stack1;
        Stack<Integer> stack2;

        QueueusingStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void add(int val) {
            stack1.push(val);
        }

        public int remove() {
            if (stack1.size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            int val = stack1.pop();
            while (stack2.size() > 0) {
                stack1.push(stack2.pop());
            }
            return val;
        }

        public void peek() {
            if (stack1.size() == 0) {
                System.out.println("Queue underflow");
                return;
            }
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            System.out.println(stack1.peek());
            while (stack2.size() > 0) {
                stack1.push(stack2.pop());
            }
        }

        public int size() {
            return stack1.size();
        }

        
    }
}
