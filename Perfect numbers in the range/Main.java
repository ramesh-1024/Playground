#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int s,e,i,j,perf;
    cin>>s>>e;
  for(i=s;i<=e;i++)
  {  perf=0;
    for(j=1;j<i;j++)
    {
     	if(i%j==0)
          perf+=j;
    }
    if(perf==i)
      cout<<i<<" ";
  }

  
    return 0;
}