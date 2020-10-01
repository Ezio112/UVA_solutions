 /*
    Created by Ezio112
*/
#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll inf(1e18);
#define mod ll(1e9+7)
#define ff first
#define ss second
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
	
	string str;
	cin>>str;
	while(str[0]!='#')
	{
		bool flag=next_permutation(str.begin(),str.end());
		if(!flag)	cout<<"No Successor\n";
		else cout<<str<<"\n";
		cin>>str;
	}
	return 0;
	
}
