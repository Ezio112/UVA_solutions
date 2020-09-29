import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int len=1000005;
		int ar[]=new int[len];
		
		ar[0]=ar[1]=1;
		for(int i=2;i<len;++i){
			if(ar[i]!=0)	continue;
			
			for(long j=2*i;j<len;j+=i)
				ar[(int)j]=1;
		}
		while(true){
			int n=sc.nextInt();
			if(n==0)	break;
			for(int i=3;i<=(n/2);++i)
			{
				if(ar[i]==0 && ar[n-i]==0){
					System.out.println(n+" = "+i+" + "+(n-i));
					break;
				}
			}
		}
	}
}
