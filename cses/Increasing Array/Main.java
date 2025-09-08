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
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        long res=0;
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1])continue;
            else{
                res+=a[i-1]-a[i];
                a[i]=a[i-1];
            }
        }
        System.out.println(res);
    }
}
