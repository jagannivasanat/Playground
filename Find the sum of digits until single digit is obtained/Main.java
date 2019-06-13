int value(int n)
{
  int sum = 0,v;
  while(n)
  {
    v = n%10;
    sum = sum + v;
    n=n/10;
  }
  return sum;
}

int main()
{
  int n,v,sum=0;
  scanf("%d",&n);
  v=value(n);
  if(v<10)
    printf("%d",v);
  else
    printf("%d",value(v));
  return 0;
}

 