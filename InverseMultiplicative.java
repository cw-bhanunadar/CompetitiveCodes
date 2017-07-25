import java.io.*;
import java.util.*;

public class Solution {
     static int nu=1000000;
     static long fac[]=new long[1000001];
     static long inverse[]=new long[1000001];
     static long mod=1000000007;
    
  static long in(long b)
  {
        long x=b;
        long ans=1;
        long n=mod-2;
        while(n>0)
        {
            if (n%2==1)
                ans=(ans*x)%mod;
            x=(x*x)%mod;
            n/=2;
    }
    return ans%mod;
 }
    
    public static void fact()
       {
        inverse[0]=1;
        fac[0]=1;
        for(int i=1;i<nu;i++)
            {
                fac[i]=(fac[i-1]*i)%mod;
                inverse[i]=in(fac[i]);
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        fact();
        int t=sc.nextInt();
       
        while(t>0)
        {
            long ans;
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m>n)
                System.out.println("0");
            else
                {
                   ans=fac[n];
                
                    ans=(ans*inverse[m])%mod;
                
                    ans=(ans*inverse[n-m])%mod;
                
                    System.out.println(ans);
                }
                
               t--;
        }
        
        
    }
}