/*
   Author: Shivam Kumar (shivam24121)
   Language: Java 21
   Date: 2025-09-08
   Time: 21
*/

import java.io.*;
import java.util.*;

public class Main{

    static int gcd(int a, int b){ return b == 0 ? a : gcd(b, a % b); }
    static boolean isPrime(int n){ if(n < 2) return false; for(int i=2; i*i<=n; i++) if(n % i == 0) return false; return true; }
    static long lcm(long a, long b){ return (a / gcd((int)a, (int)b)) * b; }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int res=1,ct=1;
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            if(c==s.charAt(i+1)){
                ct++;
            }
            else{
                ct=1;
            }
            res=Math.max(res,ct);
        }
        System.out.println(res);
    }
}
