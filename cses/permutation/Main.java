import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n==3 || n==2){
            System.out.println("NO SOLUTION");
            return;
        }
        if(n==1){
            System.out.println(1);
            return;
        }
        StringBuilder sb=new StringBuilder();
        int odd=1,even=2;
        while(even<=n){
            sb.append(even).append(" ");
            even+=2;
        }
        while(odd<=n){
            sb.append(odd).append(" ");
            odd+=2;
        }
        System.out.println(sb.toString());
    }
}
