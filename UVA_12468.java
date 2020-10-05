import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a==-1 && b==-1)	break;
			
			int ans=(b-a+100)%100;
			System.out.println(Math.min(ans,100-ans));
		}
	}
}
