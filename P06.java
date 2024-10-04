import java.io.*;
import java.util.*;

public class Solution {
    static int spaces = 0;
    static char[][] grid;
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int cases = console.nextInt();
        for (int i = 0;i < cases; i++) {
            int rows = console.nextInt(), cols = console.nextInt();
            grid = new char[rows][cols];
            for (int j = 0; j < rows; j++) {
                String temp = console.next();
                for (int k = 0; k < cols; k++) {
                    grid[j][k] = temp.charAt(k);
                }
            }
            int sections = 0;
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    if (grid[j][k] == '.') {
                        dfs(j , k);
                        sections++;
                    }
                }
            }
            if (sections == 1) {
                System.out.print(sections + " section, ");
            }
            else {
                System.out.print(sections + " sections, ");
            }
            if (spaces == 1) {
                System.out.println(spaces + " space");
            }
            else {
                System.out.println(spaces + " spaces");
            }
            spaces = 0;
        }
    }
    public static void dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '#' || grid[x][y] == '!') {
            return;
        }
        spaces++;
        grid[x][y] = '!';
        dfs(x+1, y);
        dfs(x,y+1);
        dfs(x-1,y);
        dfs(x,y-1);
        
    }
}
