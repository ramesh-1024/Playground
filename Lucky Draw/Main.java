#include<iostream>
using namespace std;
int main()
{
 int n,c=0,flag=1,i;
  cin>>n;
  if(n==1)
    flag=0;
  for(i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
      flag=0;
      break;
    }
  }
  if(flag==1)
  cout<<"Eligible";
	else
   cout<<"Not eligible";
  return 0;
}