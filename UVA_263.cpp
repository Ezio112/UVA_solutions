#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
double eps(1e-8);
struct point{
	double x,y;
	point(){x=0.0,y=0.0;}
	point(double _X,double _Y){x=_X,y=_Y;}
	
	bool operator == (point b){
		return (abs(b.x-x)<=eps && abs(b.y-y)<=eps);
	}
};
inline double distance(point a,point b){
	return sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
}
///Lines and Vector liberary
struct line{
	double a,b,c;
	line(point p1,point p2){
		if(abs(p1.x-p2.x)<=eps){
			b=0,a=1,c=-p1.x;
		}
		else{
			b=1;
			a=(p2.y-p1.y)/(p1.x-p2.x);
			c=-(a*p1.x+b*p1.y);
		}
	}
};
inline bool parellel(line l1,line l2){
	return (abs(l1.a-l2.a)<eps && abs(l1.b-l2.b)<eps);
}
inline bool same(line l1,line l2){
	return parellel(l1,l2) && abs(l1.c-l2.c)<eps;
};
struct Vector{
	double x=0,y=0;
	Vector(point tail,point head){
		x=head.x-tail.x;
		y=head.y-tail.y;
	}
};
double dot(Vector v1,Vector v2){
	return v1.x*v2.x+v1.y*v2.y;
}
Vector dir(Vector v){
	double mag=sqrt(v.x*v.x+v.y*v.y);
	v.x/=mag,v.y/=mag;
	return v;
}
inline double mag(Vector v){
	return sqrt(v.x*v.x+v.y*v.y);
}
point closestPointOnLine(point a,point b,point p){
	Vector ap(a,p),ab(a,b);
	double scale=dot(ap,ab)/mag(ab);
	
	ab=dir(ab);
	double x=a.x+ab.x*scale;
	double y=a.y+ab.y*scale;
	point close(x,y);
	return close;
}
point closestPointOnLineSegment(point a,point b,point p){
	Vector ap(a,p),ab(a,b);
	double scale=dot(ap,ab)/mag(ab);
	
	if(scale<0)	return a;
	if(scale>=mag(ab))	return b;
	return closestPointOnLine(a,b,p);
}

///Code begins here	
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	double x,y;
	while(cin>>x>>y){
		point m(x,y);
		
		ll n;
		cin>>n;
		vector<point> vec(n+1);
		for(ll i=0;i<n+1;++i){
			cin>>x>>y;
			point pt(x,y);
			vec[i]=pt;
		}
		double min_dist=1e9;
		point ans(0,0);
		
		for(int i=0;i<n;++i){
			point now=closestPointOnLineSegment(vec[i],vec[i+1],m);
			double dist=distance(m,now);
			if(dist<min_dist){
				min_dist=dist;
				ans=now;
			}
		}
		printf("%.4f\n%.4f\n",ans.x,ans.y);
	}
}
