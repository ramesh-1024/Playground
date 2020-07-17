#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,i;
  cin>>n;
  //(n*n-1)/2
  for(i=n;i>0;i--)
    sum+=n-i;
  cout<<sum;
  return 0;
}
