import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger dp[]=new BigInteger[5005];
		dp[0]=new BigInteger("0");
		dp[1]=new BigInteger("1");
		for(int i=2;i<=5000;++i)
			dp[i]=dp[i-1].add(dp[i-2]);
		while(sc.hasNext()){
			int n=sc.nextInt();
			System.out.println("The Fibonacci number for "+n+" is "+dp[n]);
		}
	}
}
