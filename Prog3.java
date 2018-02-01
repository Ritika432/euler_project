class prog3{
Public static void main (String []args)
{
long n=600851475143;
for (int i=2;i<=n;i++)
{
if (n%i==0){
n=n/i;
i--;
}}
System.out.prntln(i);
}
}
