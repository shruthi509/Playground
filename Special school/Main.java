#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
void strrev(char *str)
{
  int i=0,j=0;
  while(str[j+1]) j++;
  while(i < j)
  {
    char temp=str[i];
    str[i]=str[j];
    str[j]=temp;
    i++;
    j--;
  }
}
int main()
{
  //Type your code here.
  char a[50],b[50];
  gets(a);
  gets(b);
  strrev(b);
  if(strcmp(a,b)==0)
  {
    cout<<"It is correct";
  }
  else
    cout<<"It is wrong";
}
