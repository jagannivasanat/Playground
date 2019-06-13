#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  
  if(n==1)
    printf("1");
  if(n==2)
    printf("2");
  else
  {
    int t1=0,t2=1,t3;
    for(int x=1;x<=n;x++)
    {
      t3=t1+t2;
      t1=t2;
      t2=t3;
    }
    printf("%d",t2);
    }
 return 0;
}
