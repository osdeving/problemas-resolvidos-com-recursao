package com.everis.willams.problems.strings.knowmust;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();

        for(String color : colors) list.add(color);

        String[] removeColors = { "RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();

        for(String color : removeColors) removeList.add(color);

        System.out.println("\nArrayList: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        removeColors(list, removeList);

        System.out.println("\n\nArrayList after calling removeColors: ");

        for(var color : list) System.out.print(color +  " ");

        System.out.println();

    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> it = collection1.iterator();

        while(it.hasNext()) {
            if(collection2.contains(it.next())) it.remove();
        }
    }


}
