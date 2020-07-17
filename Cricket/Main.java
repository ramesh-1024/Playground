#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int tballs, ttarget,runs,cballs;
  float tovers,covers,kk,c1,r1;
  cin>>tballs>>ttarget>>runs>>cballs;
  int balls=cballs;
  cout<< tballs/6<<"\n";
  covers = (float)(cballs/6);
  	cout<<covers+(float)(cballs%6)/10<<"\n";
  kk=covers+(float)(cballs%6)/10;
   c1=(float)(runs)/kk;
  r1=(float)(ttarget*6)/tballs;
  printf("%.1f\n",c1);
  printf("%.1f",r1);
  if(c1>r1)
    cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";
}