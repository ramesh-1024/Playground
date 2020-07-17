#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  float score=0.0;
  while(1)
  {
    cin>>n;
    if(n<0)
    {
      score-=1;
      break;
    }
    if(n%2==0)
      score-=0.5;
    else if(n%2==1)
    {
      count++;
      score+=1;
      if(count==3)
        break;
    }
  }
	printf("%.1f",score);
}