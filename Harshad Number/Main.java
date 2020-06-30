#include <iostream>
using namespace std;

int main() 
{
  int n,sum=0,rem;
  cin>>n;
  int num=n;
  while(n>0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  if(num%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
    return 0;
}