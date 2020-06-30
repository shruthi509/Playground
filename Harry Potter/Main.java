#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,first,last,sum;
  cin>>n;
  first = n;
  last=n % 10;
  //for(first=n;first>=100;
  first=first/1000;
  sum=first+last;
  cout<<sum;
}