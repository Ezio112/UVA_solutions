import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int t=Integer.parseInt(br.readLine());
		String[] input=new String[2];
		while(t--!=0){
			input=br.readLine().split("\\s+");
			int a=Integer.parseInt(input[0]),b=Integer.parseInt(input[1]);
			int ans=b-a,dist=b-a;
			
			for(int i=1;i*i<=dist;++i){
				ans=Math.min(ans,2*i-2+(1+(dist-i*i+i-1)/i));
			}
			System.out.println(ans);
		}
	}
}
