package com.everis.willams.problems.strings.easy;

import java.util.HashSet;
import java.util.Set;

/*
Encontre todas as intercalações que podem ser formadas por duas strings onde a ordem dos caracteres são preservadas

P.ex.: "AB" e "CD" resulta em: "ACDB", "ACBD", "CABD", "CDAB", "CADB", "ABCD"
Nota: Strings como "BA** não respeitaria a ordem (AB), bem como "**DC" também não.

 */
public class InterleavingStrings {
    public static void findInterleavingStrings(String current, String stringA, String stringB, Set<String> result) {

        // insert current if the end of both strings is reached
        if(stringA.length() == 0 && stringB.length() == 0) {
            result.add(current);
            return;
        }

        // if 'stringA' is not empty, append its first char and recur for the remaining substring
        if(!stringA.isEmpty()) {
            findInterleavingStrings(current + stringA.charAt(0), stringA.substring(1), stringB, result);
        }

        // if 'stringB' is not empty, append its first char and recur for the remaining substring
        if(!stringB.isEmpty()) {
            findInterleavingStrings(current + stringB.charAt(0), stringA, stringB.substring(1), result);
        }
    }

    public static void main(String[] args) {
        String stringA = "AB";
        String stringB = "CD";

        Set<String> result = new HashSet<>();

        findInterleavingStrings("", stringA, stringB, result);

        System.out.println(result);
    }
}
