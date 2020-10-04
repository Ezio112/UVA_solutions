import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static void dfs(Vector<Integer> graph[],int visited[],int root){
		visited[root]=1;
		
		for(int i=0;i<graph[root].size();++i)	if(visited[graph[root].get(i)]==0)
			dfs(graph,visited,graph[root].get(i));
		System.out.print(root+" ");
	}
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
    //Whole question is about Topological sorting.
		while(true){
			String str[]=br.readLine().split("\\s+");
			int n=Integer.parseInt(str[0]);
			int m=Integer.parseInt(str[1]);
			if(n==0 && m==0)	break;
			
			Vector<Integer> graph[]=new Vector[n+1];
			for(int i=0;i<=n;++i)	graph[i]=new Vector<Integer>();
			
			int visited[]=new int[n+1];
			
			for(int i=0;i<m;++i){
				str=br.readLine().split("\\s+");
				int a=Integer.parseInt(str[0]);
				int b=Integer.parseInt(str[1]);
				graph[b].add(a);
			}
			
			for(int i=1;i<=n;++i) if(visited[i]==0)
				dfs(graph,visited,i);
				
			System.out.println();
		}
	}
}
