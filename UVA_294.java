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
		
		int t=Integer.parseInt(br.readLine());
		while(t--!=0){
			String str[]=br.readLine().split("\\s+");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			int mx=a,mx_fact=counter(a);
			
			for(int i=a+1;i<=b;++i){
				int fact=counter(i);
				if(fact>mx_fact){
					mx_fact=fact;
					mx=i;
				}
			}
			System.out.println("Between "+a+" and "+b+", "+mx+" has a maximum of "+mx_fact+" divisors.");
		}
	}
}
