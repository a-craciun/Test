package com.company;

import java.util.LinkedList;

public class Arrays_Exercise10 {
//Write a Java program to swap every two adjacent nodes of a given linked list.
//Original Linked list: 10->20->30->40->50
//Expected Output: 20->10->40->30->50

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        // Elements to swap
        int element1 = 10;
        int element2 = 20;
        int element3 = 30;
        int element4 = 40;

        System.out.println("Linked List Before Swaping :-");

        for (int i : ll) {
            System.out.print(i + " ");
        }

        // Swapping the elements
        swap1(ll, element1, element2);
        swap2(ll, element3, element4);
        System.out.println();
        System.out.println();

        System.out.println("Linked List After Swaping :-");

        for (int i : ll) {
            System.out.print(i + " ");
        }
    }

    public static void swap1(LinkedList<Integer> list, int ele1, int ele2) {
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);

        if (index1 == -1 || index2 == -1) {
                return;
            }
            list.set(index1, ele2);
            list.set(index2, ele1);
    }

    private static void swap2(LinkedList<Integer> list, int ele3, int ele4) {
        int index3 = list.indexOf(ele3);
        int index4 = list.indexOf(ele4);

        if (index3 == -1 || index4 == -1) {
            return;
        }
        list.set(index3, ele4);
        list.set(index4, ele3);

    }
}
