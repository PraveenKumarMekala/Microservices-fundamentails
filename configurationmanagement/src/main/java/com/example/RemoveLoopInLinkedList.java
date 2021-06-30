package com.example;

public class RemoveLoopInLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        RemoveLoopInLinkedList list = new RemoveLoopInLinkedList();
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head.next.next.next.next.next = head.next.next;

        list.detectAndRemoveLoop(head);
        System.out.println("After removing loop");
        list.printList(head);

    }

    private void detectAndRemoveLoop(Node node) {

        if (node == null || node.next == null) {
            return;
        }

        Node slow = node.next, fast = node.next.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow == fast) {
            slow = node;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
        } else {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        }

    }

    private void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;

        }
    }
}
