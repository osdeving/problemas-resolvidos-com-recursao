package com.everis.willams.problems.strings.easy;

/*
Dada uma string, determinar se ela é um palindromo.
Palindromo são textos que, quando lidas de trás pra frente formam o mesmo texto original.
ex:
"amor a roma"
"anotaram a data da maratona"
"a cara rajada da jararaca"

Neste caso, os espaços devem ser ignorados.

 */

public class Palindrome {
    public static boolean isPalindrome1(String s, boolean ignoreSpaces) {
        for(int i = 0, j = s.length() - 1; i != j; i++, j--) {

            if(ignoreSpaces) {
                if(s.charAt(i) == ' ') i++;
                if(s.charAt(j) == ' ') j--;

                if(i == j) break;
            }


            if(s.charAt(i) != s.charAt(j)) return false;
        }

        return true;
    }

    public static boolean isPalindrome2(String s, int low, int high, boolean ignoreSpaces) {

        if(ignoreSpaces) {
            if(s.charAt(low) == ' ') low++;
            if(s.charAt(high) == ' ') high--;
        }

        if(low >= high) return true;

        if(s.charAt(low) != s.charAt(high)) return false;

        return isPalindrome2(s, low + 1, high - 1, ignoreSpaces);
    }

    public static void main(String[] args) {
        String s1 = "anotaram a data da maratona";
        String s2 = "a cara rajada da jararaca";
        if(isPalindrome1(s1, true)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

        if(isPalindrome2(s2, 0, s2.length() - 1, true)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }
}
