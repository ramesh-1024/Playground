#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,sq,count=0,sum,temp,flag=0;
  cin>>n;
  if(n==1)
     cout<<"Kaprekar Number";
  else{
  sq=n*n;
  temp=sq;
  while(sq>0)
  {
    count++;
    sq=sq/10;
  }
  for(i=1;i<count;i++)
  {
   	int parts=pow(10,i);
    if(parts==temp)
      continue;
    sum= temp/parts + temp%parts;
    if(sum==n)
    {
      flag=1;
      break; 
    }
  }
    if(flag==1)
     cout<<"Kaprekar Number";
    else
    cout<<"Not a Kaprekar Number";}
  return 0;
}