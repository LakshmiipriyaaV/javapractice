
import java.util.*;
public class Swap {
 
    public static void main(String[] args) {
       
      
        System.out.println("Enter the values:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       
        int y=sc.nextInt();
        System.out.println("x = "+x+", y= "+y);
        x = x + y;      
        y = x - y;      
        x = x - y;
   
        System.out.println("x = "+x+", y= "+y);
 
    }
 
}