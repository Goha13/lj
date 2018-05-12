package kz.javaonelove;

import java.util.Scanner;

public class Basic61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] chars = word.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        System.out.println("Reverse word:" + result.trim());
    }
}
