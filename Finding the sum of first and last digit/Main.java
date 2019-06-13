#include <stdio.h>
int main() {
	//Type your code
  int n,v,f,l;
  scanf("%d",&n);
  v = (int)(log10(n));
  f = n/((int)pow(10,v));
  l = n % 10;
  printf("%d",f+l);
	return 0;
}