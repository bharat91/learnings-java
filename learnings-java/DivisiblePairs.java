import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisiblePairs {

    static int noOfDivisiblePairs(int[] arr, int k){
        // arr = {1 3 2 6 1 2}
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]+arr[i])%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        System.out.println(noOfDivisiblePairs(a,k));
    }
}

