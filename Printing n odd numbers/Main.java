#include <stdio.h>
int main() 
{
   int n,i,x=1;
   scanf("%d",&n);
   for(int i=1;i<=n;i++)
   {
      printf("%d\n",x);
      x += 2;
   }
  return 0;
}