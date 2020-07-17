#include <iostream>
using namespace std;
void pattern(int);

int main()
{
int n;
//printf("enter the value of n : ");
cin>>n;
pattern(n);
return 0;
}

void pattern(int n)
{
int i, j, k, s;
int a = 1;
int b = n*n + 1;
for (i = n; i >= 1; i--)
{
for (s = 0; s < n - i; s++)
printf("--");

for (j = 0; j < i; j++)
printf("%d*", a++);

for (k = 0; k < i - 1; k++)
printf("%d*", b++);

printf("%d\n", b);

b -= 2*(i - 1);
}
}