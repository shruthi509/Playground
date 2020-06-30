#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[10];
  gets(a);
  cout<<"The number of letters in the name is "<<strlen(a);
}