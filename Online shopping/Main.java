#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,l,m,n,x,y,z,flip,snap,amaz;
  cin>>a>>b>>c;
  cin>>l>>m>>n;
  cin>>x>>y>>z;
  flip=(a-(a*b/100))+c;
  snap=(l-(l*m/100))+n;
  amaz=(x-(x*y/100))+z;
  cout<<"In Flipkart Rs."<<flip<<endl;
  cout<<"In Snapdeal Rs."<<snap<<endl;
  cout<<"In Amazon Rs."<<amaz<<endl;
  if(snap<flip && snap<amaz)
    cout<<"He will prefer Snapdeal";
  else if(flip<amaz)
    cout<<"He will prefer Flipkart";
  else
    cout<<"He will prefer Amazon";
}