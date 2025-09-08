/*
   Author: Shivam Kumar (shivam24121)
   Language: Java 21
   Date: 2025-09-08
   Time: 21
*/

import java.io.*;
import java.util.*;

public class Cses1{

    static int gcd(int a, int b){ return b == 0 ? a : gcd(b, a % b); }
    static boolean isPrime(int n){ if(n < 2) return false; for(int i=2; i*i<=n; i++) if(n % i == 0) return false; return true; }
    static long lcm(long a, long b){ return (a / gcd((int)a, (int)b)) * b; }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        while(n!=1){
            System.out.print(n+" ");
            if((n&1)==1){
                n=3*n+1;
            }
            else{
                n=n/2;
            }
        }
        System.out.println(1);
    }
}

           
