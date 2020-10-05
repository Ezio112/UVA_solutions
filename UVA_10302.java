import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static int counter(int n){
		int i=1,count=0;
		while(i*i<n){
			if(n%i==0)	count+=2;
			++i;
		}
		if(n%(i*i)==0)	++count;
		return count;
	}
			
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n=Integer.parseInt(br.readLine());
			long s=(n*n+n)/2;
			System.out.println(s*s);
		}
	}
}
