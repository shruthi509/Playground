#include<iostream>
#include<cmath>
using namespace std;
int bacteria(int,int);
int main()
{
  int a,b,req;
  cin>>a>>b>>req;
  int s=bacteria(a,b);
  if(req<=s)
    cout<<"Doctor, you can proceed with your experiment.";  
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int bacteria(int x,int y)
{
  int d=x*x*x;
  return d;
}