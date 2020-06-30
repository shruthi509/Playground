#include <iostream>
int main()
{
  int n,rem;
  std::cin>>n;
  rem=n%9;
  if(rem==0)
    std::cout<<9;
  else
    std::cout<<rem;
  
}