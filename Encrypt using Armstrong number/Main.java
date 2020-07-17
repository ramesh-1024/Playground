#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int i,count=0,sum=0;
  int temp=n,temp1=n;
  while(n>0)
  {
    count++;
    n=n/10;
  }
  //cout<<count;
 while(temp>0)
 {
   i=temp%10;
   temp=temp/10;
   //cout<<power(count,i)<<"\n";
   sum+=power(i,count);
 }
  //cout<<sum;
  if(temp1==sum)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}