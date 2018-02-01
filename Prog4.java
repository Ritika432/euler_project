class Prog4{
public static void main (String[]args)
{
long p;
for(int i=100;i<=999;i++)
{
for (j=100;j<=999;j++)
{
p=i*j;
if (reverse(p))
System.out.println (p);
break;
}}}
public static reverse(long l)
{
long rev=0;
while(l!=0)
{
int d=l%10;
r=(r*10)+d;
l=l/10;
}
return (r==l)
}
}
}
