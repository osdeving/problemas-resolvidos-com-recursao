package com.everis.willams.problems.strings.easy;

public class Fatorial {
    static int fatorial(int n) {
        return n == 0 ? 1: n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        var n = fatorial(4);
        System.out.println(n);
    }
}
