import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ApplesOranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int finalDist = 0;
        int countApple = 0;
        int countOrange = 0;
        
        for(int apple_i = 0;apple_i<m;apple_i++){
            finalDist = a + apple[apple_i];
            if(finalDist >= s && finalDist <= t){
                countApple++;
            }
        }
        
        finalDist = 0;
        for(int orange_i = 0;orange_i<n;orange_i++){
            finalDist = b + orange[orange_i];
            if(finalDist >= s && finalDist <= t){
                countOrange++;
            }
        }
        
        System.out.println(countApple);
        System.out.println(countOrange);
        
    }
}

