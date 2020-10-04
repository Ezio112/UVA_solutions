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
			long ar[]=new long[3];
			for(int i=0;i<3;++i)
				ar[i]=(long)Integer.parseInt(ar1[i]);
			Arrays.sort(ar);
			
			System.out.print("Case "+Case+": ");
			if(ar[2]>=ar[0]+ar[1])
				System.out.println("Invalid");
			else if(ar[0]==ar[1] && ar[1]==ar[2])
				System.out.println("Equilateral");
			else if(ar[0]==ar[1] || ar[1]==ar[2])
				System.out.println("Isosceles");
			else
				System.out.println("Scalene");
			++Case;
		}
	}
}
