import java.util.*;
import java.io.*;
import java.math.*
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		int n=0;
		while(sc.hasNext()){
			n=sc.nextInt();
			int x=1,num=1;
			while(num%n!=0){
				++x;
				num=(num*10+1)%n;
			}
			System.out.println(x);
		}		
	}
}
