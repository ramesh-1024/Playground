#include <iostream>
using namespace std;
int sing(int n)
{
  int sum=0;
  while(n>0 || sum>9)
  {
    if(n==0)
    {n=sum;
     sum=0;}
    sum=sum+n%10;
    n=n/10;
  }
  return sum;
    
    
  }
  

int main() 
{
   // Try out your code here
  int n;
  cin>>n;
    cout <<sing(n);
    return 0;
}