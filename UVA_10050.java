import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		while(t--!=0){
			int n=Integer.parseInt(br.readLine());
			int p=Integer.parseInt(br.readLine());
			
			int days[]=new int[n+5];
			
			for(int i=0;i<p;++i)
			{
				int k=Integer.parseInt(br.readLine());
				for(int j=k;j<=n;j+=k)
					days[j]=1;
			}
			int total=0;
			for(int i=1;i<=n;++i) if(i%7!=0 && i%7!=6)
				total+=days[i];
			System.out.println(total);
			
		}
	}
}
