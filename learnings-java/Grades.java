import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grades {

    static int[] solve(int[] grades){
        for(int i=0;i<grades.length;i++){
            if(grades[i] < 40){
                if(Math.abs(grades[i]-40) < 3){
                    grades[i] = 40;
                }
            }else if(Math.abs(((int)Math.round(Math.abs(grades[i]/5))*5+5)-grades[i]) < 3){
                grades[i] = ((int)Math.round(Math.abs(grades[i]/5))*5+5);
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != n - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
