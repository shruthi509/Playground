#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,a,b,c,f,l,m;
  int d=3,e=4;
  std::cin>>x>>y;
  a=x-d;
  b=y-e;
  l=a*a;
  m=b*b;
  c=l+m;
  f=sqrt(c);
  std::cout<<f;
}