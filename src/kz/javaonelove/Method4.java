package kz.javaonelove;

import java.util.Scanner;

public class Method4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string: ");
        String string = in.nextLine();
        System.out.println("Number of Vowels in the string:" + countVowels(string) + "\n");
    }

    public static int countVowels(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'u' || string.charAt(i) == 'a' || string.charAt(i) == 'o'
                    || string.charAt(i) == 'e' || string.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }
}
