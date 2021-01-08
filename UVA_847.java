import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static int dfs(int n){
		if(n<=9)	return 1;
		if(n<=18)	return 2;
		int required=(n+8)/9;
		int to_give=(required+1)/2;
		
		return dfs(to_give);
	}
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(sc.hasNext()){	
			int target=sc.nextInt();
			int winner=dfs(target);
			if(winner==1)	System.out.println("Stan wins.");
			else System.out.println("Ollie wins.");
		}
	}
}
