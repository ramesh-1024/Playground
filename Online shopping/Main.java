#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as,fbal,sbal,abal,fdisk,sdisk,adisk;
  //float fbal,sbal,abal;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  fdisk=(fa*fd)/100;
  sdisk=(sa*sd)/100;
  adisk=(aa*ad)/100;
 fbal=fa-fdisk+fs;
  sbal=sa-sdisk+ss;
  abal=aa-adisk+as;
  
  cout<<"In Flipkart Rs."<<fbal<<"\n";
  cout<<"In Snapdeal Rs."<<sbal<<"\n";
  cout<<"In Amazon Rs."<<abal<<"\n";
  
  if(fbal<=sbal && fbal<=abal)
    cout<<"He will prefer Flipkart";
  else if(sbal<=fbal && sbal<=abal)
    cout<<"He will prefer Snapdeal";
  else 
    cout<<"He will prefer Amazon";
  
}