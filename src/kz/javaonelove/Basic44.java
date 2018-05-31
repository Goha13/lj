package kz.javaonelove;

import java.util.Scanner;

public class Basic44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        int sum, sum2 = 0;
        int y = determineNumberDegree(n);
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                sum = (int) (n * Math.pow(Math.pow(10, y), j - 1));
                sum2 += sum;
            }
        }
        System.out.println(sum2);
    }

    static int determineNumberDegree(int n) {
        int sum3 = 0;
        while (n > 0) {
            n = n / 10;
            sum3++;
        }
        return sum3;
    }
}
