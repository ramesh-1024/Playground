#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  unsigned int n,sum=0;
  cin>>n;
  sum+=(n%10);
  n=n/10;
  n=n/10;
  sum+=(n/10);
  //cout<<2001%1000;
 cout<<sum;
}