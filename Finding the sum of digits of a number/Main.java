#include <stdio.h>
int main() {
	//Type your code
  int n,r,sum;
  scanf("%d",&n);
  sum = 0;
  while(n)
  {
    r = n % 10;
    sum = sum + r;
    n = n / 10;
  }
  printf("%d",sum);
	return 0;
}