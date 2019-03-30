package OOP;

public class Throw {
    
   public static void point() 
    { 
        try
        { 
           throw new ArithmeticException("Exception"); 
          
        } 
        catch(ArithmeticException e1) 
        { 
            System.out.println("Somthing happening..."); 
            throw e1; 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        try
        { 
            point(); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.println("This is main function"); 
        } 
    } 
}
