package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Arrays_Exercise11 {
//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3

    public static void main(String args[]) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        list1.addAll(list2);

        list3(list1);
    }

    public static void list3(LinkedList<Integer> list1) {
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.addAll(list1);
        System.out.println(list3);

        Collections.sort(list3);
        System.out.println("Sorted final list: " + list3);

    }
}
