import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long n = console.nextLong();
        for (int i = 0;i < n; i++) {
            long num = console.nextLong();
            long sum = 0;
            for (long j = 0; j <= num; j++) {
                sum += (j*(j+1))/2;
            }
            System.out.println(sum);
        }
    }
}
