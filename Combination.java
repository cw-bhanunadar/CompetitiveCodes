import java.util.*;
class Combination 
{
     public static long C(int n, int m){
     if ( m > (n - m)) m = n - m + 1 - 1;
    
     long ans=1;
    
     for(int i=0;i<m;i++) ans=ans*(n-i)/(i+1);
    
     return ans;
}
	public static void main(String[] args) 
	{

		BufferedReader sc = new BufferedReader(new InputStreamReader());
		int t=sc.nextInt();
		while (t > 0){
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(C(n-1,m-1));
		t -= 1;
	}
}
