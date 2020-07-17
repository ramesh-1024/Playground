#include <iostream>
#include<string.h>

using namespace std;

int main() 
{
   // Try out your code here
  char a[10];
  int b;
  cin>>a;
  cin>>b;
 if(strcmp(a,"front")==0)
 {
   if(b==1)
     cout<<"Left Handed";
   else
     cout<<"Right Handed";
 }
  else
  {
	if(b==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  
    return 0;
}