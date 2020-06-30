#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units,rs;
  cin>>units;
  if(units<=200)
  {
    rs=units*0.5;
  }
  else if(units<=400)
  {
    rs=units*0.65+100;
  }
  else if(units<=600)
  {
    rs=units*0.80+200;
  }
  else if(units>600)
  {
    rs=units*01.25+425;
  }
  cout<<"Rs."<<rs;
}