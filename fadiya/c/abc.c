#include<stdio.h>
int main()
{
int a,b,c;
printf("enter three numbers");
scanf("%d%d%d",&a,&b,&c);
if(a>=b && a>=c);
{
printf("a greaterthan b&c %d",a);
}
else if(b>=a && b>=c);
{
printf("b greaterthan a&c %d",b);
}
else
{
printf("c greaterthan a&b %d",c);
}
return 0;
}
