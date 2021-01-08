import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void dfs(int p,int q){
		if(p==1){
			System.out.println(q+"]");
			return;
		}
		else{
			System.out.print(q/p+",");
			dfs(q%p,p);
		}
	}
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(sc.hasNext()){
			int p=sc.nextInt();
			int q=sc.nextInt();
			System.out.print("["+(p/q)+";");
			dfs(p%q,q);
		}
	}
}
