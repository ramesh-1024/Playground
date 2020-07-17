#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  cin>>r>>c>>t;
  if( (t>=1 && t<=c) || ( t%c==1 ) || (t%c==0) )
    cout<<"Yes";
  else
    cout<<"No";
}