import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    static String amountToRefund(int[] arr, int k, int actual){
        int sum = 0;
        int i=0;
            while(i<arr.length){
                if(i!=k){
                    sum += arr[i];    
                }
                i++;
            }
        
        int diff = (int)Math.abs((int)sum/2 - actual);
        
        if(diff > 0){
            return String.valueOf(diff);
        }else{
            return "Bon Appetit";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] itemCosts = new int[n];
        for(int i=0;i<n;i++){
            itemCosts[i] = sc.nextInt();
        }
        int actualCharged = sc.nextInt();
        System.out.println(amountToRefund(itemCosts, k, actualCharged));
        sc.close();
        
    }
}
