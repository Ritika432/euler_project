class Prog2
{
public static void main (String []srgs)
{
int a=0,b=1,bo=4000000,s=0,i;
boolean c=false;
while (!c)
{
i=a+b;
a=b;
b=i;
if (i>bo)
{
c=true;
}
if (i%2==0)
{
s=s+i;
}}
System.out.println (s);
}}
