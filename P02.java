import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += console.nextInt();
        }
        System.out.println(sum);
    }

}
