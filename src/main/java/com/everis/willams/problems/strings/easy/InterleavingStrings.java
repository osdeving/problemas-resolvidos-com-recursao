package com.everis.willams.problems.strings.easy;

import java.util.HashSet;
import java.util.Set;

public class InterleavingStrings {
    public static void findInterleavingStrings(String current, String first, String second, Set<String> result) {

        // insert current if the end of both strings is reached
        if(first.length() == 0 && second.length() == 0) {
            result.add(current);
            return;
        }

        // if 'first' is not empty, append tis first char and recur for the remaining substring
        if(!first.isEmpty()) {
            findInterleavingStrings(current + first.charAt(0), first.substring(1), second, result);
        }

        // if 'second' is not empty, append its first char and recur for the remaining substring
        if(!second.isEmpty()) {
            findInterleavingStrings(current + second.charAt(0), first, second.substring(1), result);
        }
    }

    public static void main(String[] args) {
        String first = "ABC";
        String second = "ACB";

        Set<String> result = new HashSet<>();

        findInterleavingStrings("", first, second, result);

        System.out.println(result);
    }
}
