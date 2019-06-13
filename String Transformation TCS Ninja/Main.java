#include <stdio.h>
int main()
{
  char a[15];
  char b[15];
  char c[15];
  
  scanf("%s",a);
  scanf("%s",b);
  scanf("%s",c);
  
  for(int i=0;a[i]!='\0';i++)
  {
    if(a[i]== 'a' || a[i]== 'e' || a[i]== 'i' || a[i]== 'o' || a[i]== 'u')
       a[i] = '$';
  }
  for(int i=0;b[i]!='\0';i++)
  {
    if(!(b[i]== 'a' || b[i]== 'e' || b[i]== 'i' || b[i]== 'o' || b[i]== 'u'|| b[i]==' '))
       b[i] = '#';
  }
 for(int i=0;c[i]!='\0';i++)
  {
    c[i] = c[i] - 32;
  }
  printf("%s%s%s",a,b,c);
  
  return 0;
}