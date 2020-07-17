#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int i,j,n;
  cin>>n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<=i;j++)
      cout<<n+i;
    cout<<"\n";
  }
  for(i=3;i>=0;i--)
  {
    for(j=i;j>=0;j--)
      cout<<n+i;
    cout<<"\n";
  }
    return 0;
}