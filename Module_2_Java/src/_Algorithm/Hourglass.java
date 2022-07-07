package _Algorithm;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Height: ");
        int rows = Integer.parseInt(scanner.nextLine());
        int k = 0;
        while (rows % 2 == 0) {
            for (int i = rows; i >= 1; --i) {
                for (int space = 1; space <= rows - i; ++space) {
                    System.out.print("  ");
                }
                for (int j = i; j <= 2 * i; ++j) {
                    System.out.print("* ");
                }
                for (int j = 0; j < i - 1; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i <= rows; ++i, k = 0) {
                for (int space = 1; space <= rows - i; ++space) {
                    System.out.print("  ");
                }
                while (k != 2 * i) {
                    System.out.print("* ");
                    ++k;
                }
                System.out.println();
            }
            break;
        }
    }
}
