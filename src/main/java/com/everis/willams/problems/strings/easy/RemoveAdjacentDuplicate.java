package com.everis.willams.problems.strings.easy;

/*

Dada uma string, remove caracteres duplicados. Em outras palavras, remove caracteres consecutivos iguais.

ex:
AAAAAAAAABBBBBBBBBBCCCCCCCCC se torna ABC
AABBCCCBB se torna ABCB

 */
public class RemoveAdjacentDuplicate {
    static String removeDuplicates(char[] charArray) {
        char prev = '\0';
        int k = 0;

        for(char c : charArray) {
            if(prev !=  c) {
                charArray[k++] = c;
                prev = c;
            }
        }

        return new String(charArray).substring(0, k);
    }

    // versão recursiva recebendo String
    static String remove(String word) {
        if(word.length() < 2) return word;

        if(word.charAt(0) == word.charAt(1))
            word = remove(word.substring(1));
        else
            word = word.charAt(0) + remove(word.substring(1));

        return word;
    }

    public static void main(String[] args) {
        String s1 = "AAAABBBBCCCCCDDDDDAAAA";
        String s2 = "AAABBBCCCCCCCCCCCCCCCCCCCCCCCCCCCCD";


        String result1 = removeDuplicates(s1.toCharArray());

        System.out.println(result1);

        String result2 = remove(s2);

        System.out.println(result2);
    }

}
