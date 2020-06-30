#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float items;
  float heat,a;
  cin>>items>>heat;
  if(items==3)
  {
    a=heat*2+0.00;
    cout<<a;
  }
  else if(items<3)
  {
    a=heat+(heat*(0.5))+0.00;
    cout<<a;
  }
  else
  {
    cout<<"Number of items is more";
  }
}