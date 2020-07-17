#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,i,k,m;
  cin>>n;
  for(i=1;i<=n;i++)
  {
      int m=2*(i-1)+1;
      for(k=1;k<=m;k++)
      {
      if(k%2==0)
        cout<<"*";
      else
        cout<<i;
      }
    cout<<"\n";
  }
  for(i=n;i>0;i--)
  {
      m=2*(i-1)+1;
     for(k=1;k<=m;k++)
      {
      if(k%2==0)
        cout<<"*";
      else
        cout<<i;
     }
    cout<<"\n";       
	}
    return 0;
}