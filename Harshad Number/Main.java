#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,r,sum=0;
  cin>>n;
  r=n;
  while(n>0)
  {
    sum+=n%10;
    n=n/10;
  }
  if(r%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
 return 0; 
}