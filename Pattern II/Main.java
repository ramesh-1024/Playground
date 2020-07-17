#include <iostream>

using namespace std;

int main()
{
   int num,n;
	cin>>n;
   num=1;
   int l=1;
   int k=num;
   for(int i=1;i<=n;i++)
   {
     k=num-1;
     
       for(int j=1;j<=num;j++)
       {
       
           if(j%2==0)
           cout<<"*";
           else
           {
               if(i%2==0)
               {
             
               cout<<k+l-num+i;
               l++;
               k=k-2;
               }
             
              else
               cout<<l++;
           }
       }
       num=num+2;//the loop is going on as a prime number 1,3,5,7
       cout<<"\n";
   }
   return 0;
}