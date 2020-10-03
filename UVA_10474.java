import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n,q,Case=1;
		while(true){
			n=sc.nextInt();
			q=sc.nextInt();
			if(n==0 && q==0)	break;
			int ar[]=new int[n];
			for(int i=0;i<n;++i)
				ar[i]=sc.nextInt();
			Arrays.sort(ar);
			
			System.out.println("CASE# "+Case+":");
			for(int i=0;i<q;++i){
				int num=sc.nextInt();
				
				int index=-1,left=0,right=n-1;
				int mid=(left+right)/2;
				while(left<=right){
					mid=(left+right)/2;
					
					if(ar[mid]==num){
						index=mid;
						right=mid-1;
					}
					else if(ar[mid]>num){
						right=mid-1;
					}
					else left=mid+1;
				}
				
				if(index>=0)
					System.out.println(num+" found at "+(1+index));
				else System.out.println(num+" not found");
				
			}
			++Case;
		}
	}
}
