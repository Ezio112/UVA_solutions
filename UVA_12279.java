import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int Case=1;
		while(true){
			int x=0,n=sc.nextInt();
			if(n==0)	break;
			
			for(int i=0;i<n;++i)
			{
				int y=sc.nextInt();
				if(y!=0)	++x;
				else --x;
			}
			System.out.println("Case "+Case+": "+x);
			++Case;
		}			
	}
}
