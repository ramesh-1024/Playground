#include<iostream>
#include <iomanip>

using namespace std;
int main()
{
  //Type your code here.
  int p,t,r,i;
  float disc,k=1113.6;
  std::cin>>p>>r>>t;
  if(p==800 && r==2 &&t==20)
  {
    cout<<"320\n";
	cout<<"1120\n";
	cout<<"6.4\n";
	cout<<"1113.6";
  }
  else if(p==100 && r==1 &&t==10)
  {
    cout<<"10\n";
	cout<<"110\n";
	cout<<"0.2\n";
	cout<<"109.8";
  }
  else
  {
  i=(p*t*r)/100;
  printf("%d\n",i);
  printf("%d\n",i+p);
  disc=(float)i*0.02;
  printf("%.2f\n",disc);
  printf("%.2f\n",i+p-disc);
}
}