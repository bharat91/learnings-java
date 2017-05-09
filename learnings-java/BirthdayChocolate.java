import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChocolate {

    static int getWays(int[] squares, int d, int m){
        // squares = {1 2 1 3 2}
        int count = 0;
        for (int i = 0; i < squares.length; i++) {
            int sum = 0;
            int at = 0;
            for (int j=i; j < squares.length; j++) {
                int v = squares[j];
                sum += v;
                at++;
                if (at == m) {
                    break;
                }
            }
            if (d == sum) {
                count++;
            }
        } 
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}

