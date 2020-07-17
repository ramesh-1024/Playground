#include <iostream>
using namespace std;

int small(int n1, int n2,int n3)
{
  if(n1<=n2 && n2<=n3)
    return n1;
  else if(n2<=n1 && n2<=n3)
    return n2;
  else 
    return n3;
}

int gcd(int s,int n1,int n2,int n3)
{
  int g;
  while(s>0)
  {
    if(n1%s==0 && n2%s==0 && n3%s==0)
    {
     g=s;
     break;
    }
    s--;
  }
  return g;
}

int main() 
{
   // Try out your code here
  int n1,n2,n3,g,s,k;
  cin>>n1>>n2>>n3>>g;
   s=small(n1,n2,n3);
   k=gcd(s,n1,n2,n3);
 if(k==g)
    cout << "Answer is correct.";
  else 
    cout<<"Answer is wrong.";
    return 0;
}