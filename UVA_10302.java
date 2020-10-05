import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(sc.hasNext()){
			long n=sc.nextLong();
			long s=(n*n+n)/2;
			System.out.println(s*s);
		}
	}
}
	
