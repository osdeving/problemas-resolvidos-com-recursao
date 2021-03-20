package com.everis.willams.problems.strings.knowmust;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};

        List<String> list1 = new LinkedList<>();

        for(String c : colors) list1.add(c);

        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};

        List<String> list2 = new LinkedList<>();

        for(String c : colors2) list2.add(c);

        list1.addAll(list2);
        list2 = null;

        printList(list1);
        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }

    private static void printReversedList(List<String> list1) {
        System.out.printf("%nReversed List:%n");

        ListIterator<String> it = list1.listIterator(list1.size());

        while(it.hasPrevious()) {
            String c = it.previous();
            System.out.printf("%s ", c);
        }

        System.out.println();
    }

    private static void removeItems(List<String> list1, int start, int end) {
        list1.subList(start, end).clear();
    }

    static void printList(List<String> list) {
        System.out.printf("%nList:%n");

        for(String c : list) System.out.printf("%s ", c);

        System.out.println();
    }

    static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> it = list.listIterator();

        while(it.hasNext()) {
            String color = it.next();
            it.set(color.toUpperCase());
        }
    }

}
