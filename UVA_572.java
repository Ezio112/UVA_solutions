import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static int dx[]={0,0,1,1,1,-1,-1,-1};
	static int dy[]={1,-1,-1,0,1,-1,0,1};
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(true){
			str=br.readLine();
			int n=Integer.parseInt(str.split("\\s+")[0]);
			int m=Integer.parseInt(str.split("\\s+")[1]);
			if(n==0 && m==0)	break;
			
			char ar[][]=new char[n][m];
			for(int i=0;i<n;++i){
				str=br.readLine();
				for(int j=0;j<m;++j)
				ar[i][j]=str.charAt(j);
			}
			
			
			int counter=0;
			for(int i=0;i<n;++i){
				for(int j=0;j<m;++j) if(ar[i][j]!='*'){
					Queue<Integer> q=new LinkedList<Integer>();
					q.add(i*1000+j);
					
					while(q.size()!=0){
						Integer node=q.poll();
						int x=node/1000,y=node%1000;
						if(x<0 || y<0 ||x>=n || y>=m || ar[x][y]=='*')
							continue;
						
						ar[x][y]='*';
						for(int dir=0;dir<8;++dir)
							q.add((x+dx[dir])*1000+(y+dy[dir]));
					}
					
					++counter;
				}
			}
			System.out.println(counter);
		}
	}
}
