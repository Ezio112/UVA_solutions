#include<bits/stdc++.h>
using namespace std;

bool valid(int a,int b,vector<vector<int>>& table){
	int n=table.size();
	for(int i=0;i<n;++i){
		bool found_a=table[i].end()!=find(table[i].begin(),table[i].end(),a);
		bool found_b=table[i].end()!=find(table[i].begin(),table[i].end(),b);

		if(found_a^found_b)
			return true;
		if(found_a&found_b)
			return false;
	}
	return false;
}
int free(int a,vector<vector<int>>& table){
	int n=table.size();
	int index=-1;
	for(int i=0;i<n;++i)
		if(find(table[i].begin(),table[i].end(),a)!=table[i].end()){
			index=i;
			break;
		}

	while(table[index].back()!=a){
		table[table[index].back()].push_back(table[index].back());
		table[index].pop_back();
	}

	return index;
}
int loc(int a,vector<vector<int>>& table){
	int n=table.size();
	
	for(int i=0;i<n;++i)
	if(find(table[i].begin(),table[i].end(),a)!=table[i].end())
		return i;
	return -1;	
}
void pile(int a,int from,int to,vector<vector<int>>& table){
	auto loc_a=find(table[from].begin(),table[from].end(),a);

	for(auto itr=loc_a;itr!=table[from].end();++itr){
		table[to].push_back(*itr);
	}
	table[from].erase(loc_a,table[from].end());
	return;
}
int main(){
	int n;
	cin>>n;
	vector<vector<int>> table(n);
	
	for(int i=0;i<n;++i)
		table[i].push_back(i);

	while(true){
		string str1,str2;
		int from,to;
		
		cin>>str1;
		if(str1=="quit")
			break;

		cin>>from>>str2>>to;

		if(!valid(from,to,table)){
			continue;
		}
		if(str1=="move"){
			if(str2=="onto"){
				int loc_from=free(from,table);
				int loc_to=free(to,table);

				table[loc_from].pop_back();
				table[loc_to].push_back(from);
			}
			else{
				int loc_from=free(from,table);
				int loc_to=loc(to,table);

				table[loc_from].pop_back();
				table[loc_to].push_back(from);
			}
		}
		else{
			if(str2=="onto"){
				int loc_to=free(to,table);
				int loc_from=loc(from,table);
				pile(from,loc_from,loc_to,table);
			}
			else{
				int loc_from=loc(from,table);
				int loc_to=loc(to,table);
				pile(from,loc_from,loc_to,table);
			}
		}
	}
	for(int i=0;i<n;++i){
		cout<<i<<":";
		for(int x:table[i])
			cout<<" "<<x;

		cout<<endl;
	}
	return 0;
}
