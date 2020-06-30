#include<iostream>
using namespace std;
int main()
{
  int n,flag=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int c;
  cin>>c;
  for(int i=0;i<n;i++)
  {
    if(a[i]==c)
    {
      flag=1;
      break;
    }
  }
    if(flag==1)
      cout<<"She passed her exam";
    else
      cout<<"She failed";
  return 0;
}
   
  
