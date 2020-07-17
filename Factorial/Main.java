#include<iostream>
using namespace std;
int fact(int n)
{
  int mul=1;
  if(n==1)
    return 1;
  else
    return n*fact(n-1);
}
int main()
{
  long long n,total;
  cin>>n;
  total=fact(n);
    cout<<"The factorial of "<<n<<" is "<<total;
  //Type your code here.
}