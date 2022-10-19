import java.util.*;
public class NumSame
{
    public static void main(String [] args)
    {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the N ");
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j = 1;
            while( j<=i)
            {
                System.out.print(i);
                j++;
            }
            System.out.println(" ");
            i++;
        }      
    }
}