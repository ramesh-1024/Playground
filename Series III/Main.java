#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,count=1;
  int i=0,result=6;
  cin>>n;
  //cout<<result<<" ";
  while(count<=n)
  {
    if(n==1){
      cout<<result;
      break;}
    result=result+(5*i);
    cout<<result<<" ";
    count++;
    i++;
  }
    //cout << "Hello, World";
    return 0;
}