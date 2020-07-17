#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,t=1,sum,count=2;
  cin>>n;
  if(n==0)
    cout<<s;
  else if(n==1)
    cout<<t;
  while(n>1)
  {
	sum=s+t;
    s=t;
    t=sum;
    count++;
    if(count==n)
    {
      cout<<sum;
      break;
    }
  }
}