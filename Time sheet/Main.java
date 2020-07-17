#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  unsigned int sun,mon,tue,wed,thu,fri,sat,total,money=0;
  cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  if(sun<=24 && mon<=24 && tue<=24 && wed<=24 && thu<=24 && fri<=24 && sat<=24)
  {
    sat=sat*125;
    sun=sun*150;
 money=sat+sun;
     if(mon>8)
      money+=(mon-8)*15+(mon*100);
    else
      money+=(mon*100);
     if(tue>8)
      money+=(tue-8)*15+(tue*100);
    else 
      money+=(tue*100);
     if(wed>8)
      money+=(wed-8)*15+(wed*100);
    else 
      money+=(wed*100);
     if(thu>8)
     money+=(thu-8)*15+(thu*100);
    // cout<<money<<"\n";
    else 
       money+=(thu*100);
     if(fri>8)
      money+=(fri-8)*15+(fri*100);
    else 
      money+=(fri*100);
    total=mon+tue+wed+thu+fri;
    if(total>40)
    {
      int k;
      money+=(k*25)+(k*100);
    }
    cout<<money;
  } 
  return 0;
}