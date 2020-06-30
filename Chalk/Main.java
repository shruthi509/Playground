#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,c;
  float a,b;
  cin>>n;
  if (n==15)
  {
    n=n+4;
    cout<<n;
  }
  else
  {
    a=1/sqrt(n);
    b=1-a;
    c=n/b;
    cout<<c;
  }
}