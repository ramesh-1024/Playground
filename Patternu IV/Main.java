#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int i,j,k,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1){
      for(j=1;j<=n-1;j++)
        cout<<i;
      cout<<i+1;
    }
    else if(i%2==0)
    {
      cout<<i+1;
      for(j=1;j<=n-1;j++)
        cout<<i;
    }
    cout<<"\n";
  }
    return 0;
}