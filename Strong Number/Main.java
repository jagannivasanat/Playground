#include <stdio.h>

int strong(int i)
{
  int r;
  r = 1;
  while(i)
  {
    r = r * i;
    i--;
  }
  return r;
}
int main() {
	//Type your code
  int n,sum,a,r;
  scanf("%d",&n);
  a = n;
  sum = 0;
  while(n)
  {
    r = n % 10;
    sum = sum + strong(r);
    n = n / 10;
  }
  if(sum == a)
    printf("Yes");
  else
    printf("No");
	return 0;
}