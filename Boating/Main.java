#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f;
  cin>>a>>b>>c;
  d=b*75;
  e=c*30;
  f=d+e;
  if(f<=a)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}