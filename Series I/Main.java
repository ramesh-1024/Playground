#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,count=1;
  float result=0.5;
  cin>>n;
  cout<<result<<" ";
  while(count<n)
  {
    if(n==1)
      break;
    result=result*3;
    cout<<result<<" ";
    count++;
  }
    //cout << "Hello, World";
    return 0;
}