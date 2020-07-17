#include<iostream>
int main()
{
  // Type your code here
  int count=0,n;
  std::cin>>n;
 do
 {
   count++;
   n=n/10;
 }while(n>0);
  std::cout<<count;
  return 0;
}