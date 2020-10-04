import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	
	static void flip(int ar[],int index){
		int left=0,right=ar.length-index;
		
		while(left<right){
			ar[left]^=ar[right];
			ar[right]^=ar[left];
			ar[left++]^=ar[right--];
		}
	}
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(sc.hasNext()){
			String[] data=sc.nextLine().split("\\s+");
			int n=data.length;
			int ar[]=new int[n];
			
			for(int i=0;i<n;++i)
				ar[i]=Integer.parseInt(data[i]);
				
			for(String x:data)
				System.out.print(x+" ");
			System.out.println();
			
			for(int i=n-1;i>=0;--i){
				int index=i;
				for(int j=0;j<i;++j) if(ar[index]<ar[j])
				index=j;
				
				if(index!=i)
				{
					if(index!=0)
						System.out.print((n-index)+" ");
						
					System.out.print((n-i)+" ");
					flip(ar,n-index);
					flip(ar,n-i);
				}
			}
			System.out.println(0);
		}
			
	}
}
