import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		int len=33000;
		int ar[]=new int[len];
		ar[0]=ar[1]=1;
		for(int i=2;i<len;++i){
			if(ar[i]!=0) continue;
			for(long j=i*i;j<len;j+=i)
				ar[(int)j]=1;
		}
		Vector<Integer> primes=new Vector<Integer>();
		for(int i=0;i<len;++i) if(ar[i]==0)
			primes.add(i);
			
		while(sc.hasNext()){
			int n=sc.nextInt(),counter=0;
			if(n==0)	break;
			for(int i=0;primes.get(i)<=(n/2);++i) if(ar[n-primes.get(i)]==0)
				++counter;
			System.out.println(counter);
		}
	}
}
