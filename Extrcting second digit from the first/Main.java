#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,v,r;
  scanf("%d",&n);
  v = (int)(log10(n));
 // printf("%d\n",v);
  r = n%((int)pow(10,v));
  //printf("%d\n",r);
  if(r==1)
    printf("%d",r);
  else
    printf("%d",r/((int)pow(10,v-1)));
	return 0;
}