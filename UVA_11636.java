import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int counter=1;
		while(true){
			int n=Integer.parseInt(br.readLine());
			if(n==-1)	break;
			
			int operation=0,num=1;
			while(num<n){
				++operation;
				num=num<<1;
			}
			System.out.println("Case "+counter+": "+operation);
			++counter;
		}
	}
}
