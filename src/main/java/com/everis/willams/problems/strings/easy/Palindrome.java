package com.everis.willams.problems.strings.easy;

public class Palindrome {
    public static boolean isPalindrome1(String s) {
        for(int i = 0, j = s.length() - 1; i != j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) return false;
        }

        return true;
    }

    public static boolean isPalindrome2(String s, int low, int high) {
        if(low >= high) return true;

        if(s.charAt(low) != s.charAt(high)) return false;

        return isPalindrome2(s, low + 1, high - 1);
    }

    public static void main(String[] args) {
        String s = "1234321";

        if(isPalindrome1(s)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

        if(isPalindrome2(s, 0, s.length() -1)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }
}
