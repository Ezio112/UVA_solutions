import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		int len=105;
		int ar[]=new int[len];
		ar[0]=ar[1]=1;
		for(int i=2;i<len;++i){
			if(ar[i]!=0) continue;
			else ar[i]=i;
			for(long j=i*i;j<len;j+=i)
				ar[(int)j]=i;
		}
		int dp[][]=new int[len][len];
		for(int i=1;i<len;++i){
			int num=i;
			while(num!=1){
				dp[i][ar[num]]++;
				num/=ar[num];
			}
			for(int j=0;j<len;++j)
				dp[i][j]+=dp[i-1][j];
		}
		while(sc.hasNext()){
			int n=sc.nextInt(),counter=0;
			if(n==0)	break;
			
			System.out.print(n+"! =");
			for(int i=0;i<len;++i) if(dp[n][i]!=0){
				System.out.printf("%3d",dp[n][i]);
			}
			System.out.println();
		}
	}
}
