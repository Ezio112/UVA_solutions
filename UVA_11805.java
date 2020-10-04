import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		int Case=1;
		while(t--!=0){
			String ar1[]=br.readLine().split("\\s+");
			int ar[]=new int[3];
			for(int i=0;i<3;++i)
				ar[i]=Integer.parseInt(ar1[i]);
			
			int ans=((ar[1]+ar[2])%ar[0]==0) ? ar[0]:((ar[1]+ar[2])%ar[0]);
			System.out.println("Case "+Case+": "+ans);
			++Case;
		}
	}
}
