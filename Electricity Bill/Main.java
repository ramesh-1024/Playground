#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units;
  cin>>units;
  if(units<=200)
    cout<<"Rs."<<(int)(units*0.5);
  else if(units<=400)
    cout<<"Rs."<<(int)(units*0.65 +100);
  else if(units<=600)
    cout<<"Rs."<<(int)(units*0.80 +200);
  else if(units>600)
    cout<<"Rs."<<(int)(units*1.25 +425);
  return 0;
}