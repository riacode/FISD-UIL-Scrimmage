import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        for (int i = 0; i < n; i++) {
            String word = console.next();
            int first = console.nextInt(), second = console.nextInt();
            String temp = word.substring(0,first) + word.substring(second);
            System.out.println(temp);
        }
    }
}
