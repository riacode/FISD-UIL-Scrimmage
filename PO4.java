import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = console.nextInt();
        for (int i = 0;i < n; i++) {
            String word = console.next();
            if (word.length() == 1) {
                System.out.println(word);
                continue;
            }
            int current = 1;
            System.out.println(word);
            for (; current < word.length()-1; current++) {
                System.out.print(word.charAt(current));
                for (int j = 0; j < word.length()-2; j++) {
                    System.out.print(" ");
                }
                System.out.print(word.charAt(word.length()-1-current));
                System.out.println();
            }
            for (int j = word.length()-1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.println();
        }
    }
}
