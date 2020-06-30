#include <iostream>
using namespace std;

int main() 
{
  int a,b,i,fact=1;
  cin>>a;
  for(i=1;i<=a;i++)
    fact=fact*i;
  cout<<"The factorial of "<<a<<" "<<"is"<<" "<<fact;
    return 0;
}