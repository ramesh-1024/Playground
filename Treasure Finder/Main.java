#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,i;
  cin>>a>>b>>c;
  if(a>b && b>c)
  {
    cout<<"The treasure is in box which has number "<<b;
    for(i=a;i>=1;i--)
      if(a%i==0 && b%i==0 && c%i==0)
      {
        cout<<"\nThe code to open the box is "<<i;
        break;
      }
  }
   else if(a>c && c>b)
  {
    cout<<"The treasure is in box which has number "<<c;
    for(i=a;i>=1;i--)
      if(a%i==0 && b%i==0 && c%i==0)
      {
        cout<<"\nThe code to open the box is "<<i;
        break;
      }
  }
  else if(c>a && b>c)
  {
    cout<<"The treasure is in box which has number "<<c;
    for(i=b;i>=1;i--)
      if(a%i==0 && b%i==0 && c%i==0){
        cout<<"\nThe code to open the box is "<<i;break;}
  }
   else if(b>a && a>c)
  {
    cout<<"The treasure is in box which has number "<<a;
    for(i=b;i>=1;i--)
      if(a%i==0 && b%i==0 && c%i==0){
        cout<<"\nThe code to open the box is "<<i;break;}
  }
   else if(c>a && a>b)
  {
    cout<<"The treasure is in box which has number "<<a;
    for(i=c;i>=1;i--)
      if(a%i==0 && b%i==0 && c%i==0){
        cout<<"\nThe code to open the box is "<<i;break;}
  }
   else if(c>b && b>a)
  {
    cout<<"The treasure is in box which has number "<<b;
    for(i=c;i>=1;i--)
      if(a%i==0 && b%i==0 && c%i==0){
        cout<<"\nThe code to open the box is "<<i;break;}
  }
  
}