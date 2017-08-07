class Alphabets
{

public static void main(String abc[])
  {
int k,l;
   for(int i=1;i<5;i++)
   {
   int alphabett=65; 
   for(int j=1;j<=i;j++)
   {
   System.out.print((char)alphabett);
   alphabett ++; 
}

if(alphabett ==  68)
{
k = i; break;
}
for (k=i;k>0;k--)
{

 System.out.print((char)alphabett);
alphabett--;
}
   System.out.println();
   }
}
}

