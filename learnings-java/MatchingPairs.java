import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingPairs {

    static int noOfPairs(int[] arr){
        
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!colors.contains(arr[i])) {
                colors.add(arr[i]);
            } else {
                pairs++;
                colors.remove(arr[i]);
            }
        }

        return pairs;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        System.out.println(noOfPairs(c));
    }
}

