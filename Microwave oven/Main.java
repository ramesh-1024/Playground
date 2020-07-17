#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float time,et;
  cin>>n>>time;
  if(n==1)
    printf("%.2f",n*time);
  else if(n==2)
  {
    et= (50*time)/100;
    printf("%.2f",time+et);
  }
  else if(n==3)
    printf("%.2f",2*time);
  else if(n>3)
    cout<<"Number of items is more";
  
}