#include <iostream>
using namespace std;
int main() 
{
   // Try out your code here
  int n,m,perf=0,i,j;
  cin>>n>>m;
  int k=m+n;
  for(i=1;i<k;i++)
  {
    if(k%i==0)
      perf+=i;
  }
  if(perf==k)
    cout<<"They can read the message";
  else 
    cout<<"They can't read the message";
    return 0;
}