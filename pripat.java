class pripat
{ 
public static void main (String a[]) 
{
int number=3;

 for (int i = 0; i <= (number * 2 + 1); i++)
   {
       for (int j = 0; j <= (number * 2 + 1); j++)
       {
           if (i == j) 
           {
               System.out.print("*");
           }
           else if (i + j == (number * 2 + 2))
           {
               System.out.print("*");
           }
           else
           {
               System.out.print(" ");
           }
       }
       System.out.println("");
   }
}
} 