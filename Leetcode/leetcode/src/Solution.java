import com.sun.jdi.Value;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length=A.length()+B.length();
        System.out.println(length);
        if (A>B){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}



