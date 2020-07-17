#include <iostream>
using namespace std;
int main() 
{
   // Try out your code here
   int x,y;
  cin>>x>>y;
  if(x>y)
    cout<<"Yes, you can enter.";
  else if(x==y)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
}