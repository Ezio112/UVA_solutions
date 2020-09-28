import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long dp[]=new long[5005];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=5000;++i)
			dp[i]=dp[i-1]+dp[i-2];
		while(sc.hasNext()){
			int n=sc.nextInt();
			System.out.println("The Fibonacci number for "+n+" is "+dp[n]);
		}
	}
}
