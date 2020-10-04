import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(sc.hasNext()){
			String a=sc.nextLine();
			String b=sc.nextLine();
			
			int ar_a[]=new int[26];
			int ar_b[]=new int[26];
			
			for(int i=0;i<a.length();++i)	ar_a[(int)a.charAt(i)-(int)'a']++;
			for(int j=0;j<b.length();++j)	ar_b[(int)b.charAt(j)-(int)'a']++;
			
			for(int i=0;i<26;++i){
				int rep=Math.min(ar_a[i],ar_b[i]);
				
				while(rep--!=0)
					System.out.print((char)('a'+(char)i));
			}
			System.out.println();
		}
	}
}
	
