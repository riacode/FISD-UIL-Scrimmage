import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for (int i = 0; i < cases; i++) {
            double a = console.nextDouble(), b = console.nextDouble(), c = console.nextDouble();
            double x_positive = ((-1.0 * b) + Math.sqrt(b*b-4.0*a*c))/(2.0*a);
            
            //x_positive = Math.round(x_positive*1000)/1000.0;
            double x_negative = ((-1.0 * b) - Math.sqrt(b*b - 4.0*a*c))/(2.0*a);
            //x_negative = Math.round(x_negative*1000)/1000.0;
            
            System.out.printf("%.3f", x_positive);
            System.out.print(", ");
            System.out.printf("%.3f", x_negative);
            System.out.println();
        }
    }
}
