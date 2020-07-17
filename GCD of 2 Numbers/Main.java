#include <iostream>
using namespace std;
int gcd(int a, int b)
{
  if (a == 0) 
       return b; 
    if (b == 0) 
       return a; 
    if (a == b) 
        return a; 
    if (a > b) 
        return gcd(a-b, b); 
    return gcd(a, b-a); 
}
int main() 
{
   // Try out your code here
  int n1,n2;
  cin>>n1>>n2;
 // gcd(n1,n2);
    cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd(n1,n2);
    return 0;
}