#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int d1,d2,c1,c2,td,tc,temp,t2;
  cin>>d1>>c1>>d2>>c2;
  td=d1+d2;
  temp=c1+c2;
  t2=temp%100;
 // cout<<td<<"\n"<<temp<<"\n"<<t2;
  if(temp>99)
    td=td+(temp/100);
  cout<<td<<"\n";
  cout<<t2;
    return 0;
}