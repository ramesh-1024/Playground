#include<iostream>
#include<cmath>
using namespace std;

int main()
{
  //Type your code here.
  int n,k,s,count;
  cin>>n;
  count=n;
  k=sqrt(n);
  //cout<<k<<"\n";
  while(1)
  {
    s=k/k;
    count+=k;
    k=s;
   	if(k==1)
    {
      count+=1;
      break;
    }
  }
  cout<<count;
  return 0;
}