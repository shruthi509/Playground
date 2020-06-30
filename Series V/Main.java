#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,b=11,c;
  cin>>n;
  if(n==1)
  {
    cout<<121<<" ";
  }
  else
  {
    cout<<121<<" ";
    for(i=1;i<n;i++)
    {
      b=b+4;
      c=b*b;
      cout<<c<<" ";
    }
  }
}