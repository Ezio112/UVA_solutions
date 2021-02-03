import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=sc.nextInt();
		for(int z=1;z<=t;++z){
			int sum=0;
			for(int i=0;i<4;++i)	sum+=sc.nextInt();
			
			int num[]=new int[3];
			for(int i=0;i<3;++i)	num[i]=sc.nextInt();
			Arrays.sort(num);
			sum+=(num[2]+num[1])/2;
			
			char grade='A';
			
			if(sum<90 && sum>=80)	grade='B';
			if(sum<80 && sum>=70)	grade='C';
			if(sum<70 && sum>=60)	grade='D';
			if(sum<60)	grade='F';
			System.out.println("Case "+z+": "+grade);
		}
	}
}
