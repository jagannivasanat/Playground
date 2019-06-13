#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long n,v;
  int r,sum;
  scanf("%ld",&n);
  v = (long)(log10(n) + 1);
  sum = 0;
  for(int i=1;i<=v;i++)
  {
    r = n%10;
    //printf("r....%d\n",r);
    sum = sum + r*pow(2,(i-1));
    //printf("sum....%d\n",sum);
    n = n/10;
    //printf("n....%d\n",n);
  }
  printf("%d",sum);
  return 0;
}