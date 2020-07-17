#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,r,sum1=0,sum2=0;
  cin>>n;
  while(n>0)
  {
    r=n%10;
    if(r%2==0)
      sum1+=r;
    else if (n%2==1)
      sum2+=r;
    n=n/10;
  }
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}