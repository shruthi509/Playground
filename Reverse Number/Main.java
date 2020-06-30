#include <iostream>
int main() 
{
  int n,a,b,c,m,p,q,r,d,e;
  std::cin>>n;
  {
    a=n%10;
    std::cout<<a;
    m=n/10;
    b=m%10;
    if(b>0)
    std::cout<<b;
    p=m/10;
    c=p%10;
    if(c>0)
    std::cout<<c;
    q=p/10;
    d=q%10;
    if(d>0)
    std::cout<<d;
    r=q/10;
    e=r%10;
    if(e>0)
    std::cout<<e;
  }
}
