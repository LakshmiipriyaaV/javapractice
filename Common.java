import java.util.*;

 

public class Common {
    
    public static void main(String[] args) {
        int b,e;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Begining range");
        b=s.nextInt();
        System.out.println("Enter Ending range");
        e=s.nextInt();
        for(int i=1;i<b;i++) {
            if(b%i == 0 &&  e%i==0) {
                System.out.println(i);
                
            }
            
        }
        
        
    }

 

}