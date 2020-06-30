#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50],b[50];
  gets(a);
  gets(b);
  if(strcmp(a,b)==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
}