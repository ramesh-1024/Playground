#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int t,n,count=0,prev=0;
  cin>>t;
  while(1)
  {
    cin>>n;
    if(n<t)
    {
      prev+=n;
      count++;
      if(prev>=t)
        break;
    }
    else if(n>=t)
    {
      count++;
      break;
    }
  }
  cout<<"The number of turns is "<<count;
  return 0;
}