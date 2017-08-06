class highestNumber
{
public static void main(String args[])
{
int a = 5;
int b = 10;
int c = 4;

if(a<=b && c<=b)
{
System.out.println(b);
}
else if(b<=a && c<=a)
{
System.out.println(a);
}
else if(a<=c && b<=c)
{
System.out.println(c);
}
}
}

