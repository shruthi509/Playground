#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int liters,distance;
  cin>>mileage>>liters>>distance;
  if(distance>liters*mileage)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}