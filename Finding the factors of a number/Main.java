#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int x=1;x<=n;x++)
  {
    if(n%x==0)
      printf("%d\n",x);
  }
	return 0;
}