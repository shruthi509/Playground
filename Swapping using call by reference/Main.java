#include <iostream>
using namespace std;
//int swap(int,int);
int swap(int a,int b)
{
  a=b;
  b=a;
}
int main() 
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a="<<" "<<x<<" "<<"and"<<" "<<"b="<<y<<"\n";
  swap(x,y);
  cout<<"After swapping a="<<" "<<y<<" "<<"and"<<" "<<"b="<<x;
}
    
  
    
