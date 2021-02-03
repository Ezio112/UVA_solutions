import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int index=1;
		while(true){
			String input[]=br.readLine().split("\\s+");
			int r=Integer.parseInt(input[0]),n=Integer.parseInt(input[1]);
			if(r==0 && n==0)	return;
			int req=(r+n-1)/n-1;
			
			System.out.print("Case "+index+": ");
			if(req>26)	System.out.println("impossible");
			else System.out.println(req);
			
			++index;
		}
	}
}
