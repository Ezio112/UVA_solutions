#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
double eps(1e-9);
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
pair<point,bool> intersectionPoint(line l1,line l2){
	if(parellel(l1,l2))	return {point(0,0),false};
	double y=-(l2.a*l1.c-l1.a*l2.c)/(l2.a*l1.b-l1.a*l2.b);
	double x=-(l2.b*l1.c-l1.b*l2.c)/(l2.b*l1.a-l1.b*l2.a);
	
	return {point(x,y),true};
}
int CCW(point start,point end, point m){
	double x1=end.x-start.x,y1=end.y-start.y;
	double x2=m.x-start.x,y2=m.y-start.y;
	double cross=(x1*y2-x2*y1);
	if(abs(cross)<eps)	return 0;
	if(cross>0)	return 1;
	return -1;
}
///Code begins here	
bool isInBetween(point left,point right,point check){
	bool along_x=min(left.x,right.x)<=check.x && max(left.x,right.x)>=check.x;
	bool along_y=min(left.y,right.y)<=check.y && max(left.y,right.y)>=check.y;
	return along_x && along_y;
}
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	ll t;
	cin>>t;
	while(t--)
	{
		double x1,y1,x2,y2;
		cin>>x1>>y1>>x2>>y2;
		point start(x1,y1),end(x2,y2);
		
		cin>>x1>>y1>>x2>>y2;
		point ar[4]={point(x1,y1),point(x1,y2),point(x2,y2),point(x2,y1)};
		line l1(start,end);
		
		bool intersect=false;
		for(int i=0;i<4;++i)
		{
			point pt1=ar[i],pt2=ar[(i+1)%4];
			line l(pt1,pt2);
			if(same(l1,l) && (isInBetween(pt1,pt2,start) ||isInBetween(pt1,pt2,end)))
			{
				
				intersect=true;
				break;
			}
			
			pair<point,bool> result=intersectionPoint(l1,l);
			if(!result.second)	continue;
			
			
			if(isInBetween(start,end,result.first) && isInBetween(pt1,pt2,result.first))
			{
				intersect=true;
				break;
			}
		}
		bool a=min(ar[0].x,ar[3].x)<=start.x && max(ar[0].x,ar[3].x)>=start.x;
		bool b=min(ar[0].y,ar[1].y)<=start.y && max(ar[0].y,ar[1].y)>=start.y;
		intersect=intersect ||(a&&b);
		if(intersect)	cout<<"T\n";
		else cout<<"F\n";
	}
		
	return 0;
}
