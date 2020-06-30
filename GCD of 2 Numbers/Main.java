#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,small=0,gcd=0;
  cin>>a>>b;
  if(a<b)
  {
    small=a;
  }
  else
  {
    small=b;
  }
  while(small>=1)
  {
    if(a%small==0 && b%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<small;
}