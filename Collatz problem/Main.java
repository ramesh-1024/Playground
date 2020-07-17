#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  cin>>n;
  if(n==1)
   {
    cout<<n<<"\n";
     //break;
   }
 while(n!=1)
  {
    if(n%2==0)
    {
      cout<<n<<"\n";
      n=n/2;
      if(n==1)
   	{
   	 cout<<n<<"\n";
        count++;
     	break;
   	}
      count++;
    }
    else if(n%2==1)
    {
      cout<<n<<"\n";
      n=3*n+1;
      count++;
     if(n==1)
   	{
   	 cout<<n<<"\n";
        count++;
     	break;
   	}
    } 
  }
  cout<<count;
}