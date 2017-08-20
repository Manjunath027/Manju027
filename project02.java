import java.util.Scanner;

class project02
{
public static void main(String args[])
{
int maths,i;
for (i=0;i<4;i++)
{
Scanner obj = new Scanner(System.in);
maths=obj.nextInt();
System.out.println("enter the marks of Maths") ;
if(maths >= 71)
{
System.out.println(" Grade is A"); 
}
else if(maths>=60 || maths<=70)
{
System.out.println("Grade is B") ;
}
else if(maths<=59)
{
System.out.println("Grade is C");
}
}
}
}