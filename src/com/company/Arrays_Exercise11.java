package com.company;

public class Arrays_Exercise11 {
//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3

    public static void main(String args[]) {

        MergeLists list1 = new MergeLists();
        MergeLists list2 = new MergeLists();

        list1.addToTheLast(new Node(1));
        list1.addToTheLast(new Node(2));
        list1.addToTheLast(new Node(4));

        list2.addToTheLast(new Node(1));
        list2.addToTheLast(new Node(3));
        list2.addToTheLast(new Node(4));

        list1.head = new MergedList().sortedMerge(list1.head, list2.head);
        list1.printList();

    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class MergeLists {
        Node head;

        public void addToTheLast(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = node;
            }
        }

        /* Method to print linked list */
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    static class MergedList {
        Node sortedMerge(Node headA, Node headB) {

            Node myNode = new Node(0);
            Node tail = myNode;
            while (true) {

                if (headA == null) {
                    tail.next = headB;
                    break;
                }
                if (headB == null) {
                    tail.next = headA;
                    break;
                }

                if (headA.data <= headB.data) {
                    tail.next = headA;
                    headA = headA.next;
                } else {
                    tail.next = headB;
                    headB = headB.next;
                }

                tail = tail.next;
            }
            return myNode.next;
        }
    }
}
