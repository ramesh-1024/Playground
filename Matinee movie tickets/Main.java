#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  cin>>age>>time;
  	if(time==10.15f && age<=13)
	cout<<"$4.00";
  	else if(time==10.15f && age>13)
    cout<<"$8.00";
  	else if(time==13.30f&& age<=13)
	cout<<"$2.00";
  	else if(time==13.30f && age>13)
    cout<<"$5.00";
  	else if(time==18.00f&& age<=13)
	cout<<"$4.00";
  	else if(time==18.00f && age>13)
    cout<<"$8.00";
 	else if(time==22.00f&& age<=13)
	cout<<"$4.00";
  	else if(time==22.00f && age>13)
    cout<<"$8.00";
  return 0;
}