#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if((t<=c*2 && t>=c+1)||(t>=r*c-2*c && t<=r*c - c))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  return 0;
  //Type your code here.
}