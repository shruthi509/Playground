#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,i,r;
  double si,amt,dis,tot;
  std::cin>>p>>i>>r;
  si=(p*i*r)/100;
  amt=p+si;
  dis=si*2/100;
  tot=amt-dis;
  std::cout<<si<<endl<<amt<<endl<<dis<<endl<<tot;
  
}