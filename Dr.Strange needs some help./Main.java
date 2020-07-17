#include <iostream>
using namespace std;

int bacteria(int m,int n)
{
  int i,res=1;
  for(i=0;i<n;i++)
  {
    res*=m;
  }
  return res;
}

int main() 
{
   // Try out your code here
  int m,n,req;
  cin>>m>>n>>req;
  if(bacteria(m,n)>=req)
    cout << "Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
    return 0;
}