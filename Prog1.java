class Prog1
{
public static void main (String args[])
{
System.out.println ("sum="+getsum());
}
public static int getsum()
{
int s=0;
for(int i=1;i<1000;i++)
{
if (i%3==0||i%5==0)
{
s=s+i;
}}
return s;
}
