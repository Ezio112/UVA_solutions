import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static void sort(double ar[][]){
		int n=ar[0].length;
		for(int i=0;i<n;++i){
			int index=i;
			double x=ar[0][i];
			
			for(int j=i+1;j<n;++j){
				if(x>ar[0][j]){
					index=j;
					x=ar[0][j];
				}
			}
			double x1=ar[0][index],y1=ar[1][index];
			ar[0][index]=ar[0][i];
			ar[1][index]=ar[1][i];
			
			ar[0][i]=x1;
			ar[1][i]=y1;
		}
	}
		
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=sc.nextInt();
		while(t--!=0){
			int n=sc.nextInt();
			double ar[][]=new double[2][n];
			
			for(int i=0;i<n;++i)
			{
				ar[0][i]=sc.nextDouble();
				ar[1][i]=sc.nextDouble();
			}
			sort(ar);

			double sum=0,mx_y=0;
			for(int i=n-2;i>=0;--i){
				double m=(ar[1][i+1]-ar[1][i])/(ar[0][i+1]-ar[0][i]);
				if(m>=0)	continue;
				
				sum+=Math.max(ar[1][i]-mx_y,0.0)*Math.sqrt(1+1/(m*m));
				mx_y=Math.max(mx_y,ar[1][i]);
			}
			System.out.printf("%.2f\n",sum);
		}
	}
}
