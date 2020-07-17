#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,ad,ch,sum;
  cin>>w>>ad>>ch;
  sum=(ad*75) + (ch*30);
  if(sum<=w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  
  return 0;
}