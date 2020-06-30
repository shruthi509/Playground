#include<iostream>
using namespace std;
int main()
{
  int a,b,x,y;
  std::cin>>a>>b;
  if(a>b)
  {
    x=a+1900;
    y=b+2000;
    std::cout<<y-x;
  }
  else
  {
    x=a+2000;
    y=b+2000;
    std::cout<<y-x;
  }
  return 0;
}
