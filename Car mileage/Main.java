#include<iostream>
using namespace std;
int main()
{
  float m;
  int dist,lit;
  cin>>m>>lit>>dist;
  if((lit*m)>=dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}