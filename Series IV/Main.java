#include<iostream>
using namespace std;
int main() 
{
   // Try out your code here
  int n,count=2;
  int i=1,result=2,f=1;
  cin>>n;
  if(n==1)
    cout<<"0 ";
  else if(n==2)
     cout<<"0 2 ";
  else
  {
    cout<<"0 2 ";
  while(1)
  {
    if(n==1)
      break;
    int count2=0;
    while(count2<2)
    {
      result=result+2+4*i;
      cout<<result<<" ";
      count2++;
      count++;
      if(count==n)
      {  f=0;
      break;}
    }
    //count++;
    if(f==0)
      break;
    i++;
  }}
    //cout << "Hello, World";
    return 0;
}