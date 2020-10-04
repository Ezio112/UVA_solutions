import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		int total=0;
		while(t--!=0){
			String str=br.readLine();
			if(str.charAt(0)=='r')
				System.out.println(total);
			else total+=Integer.parseInt(str.split("\\s+")[1]);
		}
	}
}
