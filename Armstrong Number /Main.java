#include <stdio.h>
int power(int i,int j)
{
  int v=1;
  for(int x = 1;x <= j;x++)
     v = v * i;
 return v;
}
int main() {
	//Type your code
   int n,sum,l,a;
  scanf("%d",&n);
  a = n;
  l = (int)(log10(n) + 1);
  sum = 0;
  while(n)
  {
    sum = sum + power((n%10),l);
    n = n/10;
  }
  if(sum == a) 
     printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}