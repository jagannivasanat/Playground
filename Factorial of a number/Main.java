#include <stdio.h>
int main() {
	//Type your code
  int n,p;
  scanf("%d",&n);
  p = 1;
  while(n)
  {
    p = p * n;
    n--;
  }
  printf("%d",p);
	return 0;
}