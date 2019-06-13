#include <stdio.h>

int main()
{
  int n,isPrime=1;
  scanf("%d",&n);
  if(n==0)
    printf("neither");
  else
  {
    for(int x=2;x<=n/2;x++)
    {
      if(n%x==0)
        isPrime++;
    }
    if(isPrime>1)
      printf("composite");
    else
      printf("prime");
  }
  
   return 0;
}