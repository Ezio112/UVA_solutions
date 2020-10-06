import java.util.*;
import java.io.*;
import java.math.*;
public class Main{

	static int taken[]=new int[100];
	static void dfs(int ar[],int rem,int index){
		if(rem==0 && index==ar.length)
		{
			boolean first=true;
			for(int i=0;i<ar.length;++i)	if(taken[i]!=0)
			{
				if(!first)	System.out.print(" ");
				System.out.print(ar[i]);
				first=false;
			}
			System.out.println();
			return;
		}
		if(index>=ar.length)	return;
		
		taken[index]=1;
		dfs(ar,rem-1,index+1);
		taken[index]=0;
		dfs(ar,rem,index+1);
	}
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		boolean first=true;
		while(true){
			String ar_str[]=br.readLine().split("\\s+");
			if(ar_str.length==1 && ar_str[0].charAt(0)=='0')	break;
			if(!first)	System.out.println();
			int n=Integer.parseInt(ar_str[0]);
			
			int ar[]=new int[n];
			for(int i=1;i<=n;++i)
				ar[i-1]=Integer.parseInt(ar_str[i]);
				
			Arrays.sort(ar);
			dfs(ar,6,0);
			first=false;
		}
	}
}
	
