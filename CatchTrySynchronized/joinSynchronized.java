
package javathreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacksparrow
 */
public class joinSynchronized {
    
    private static int count = 0;
    
    public static synchronized void  incount(){
        count++;
    }
    
    public static void main(String[] args){
        
        Thread t1 = new Thread (new Runnable() {
           
            @Override 
            public void run(){
                for(int i =0 ;i<1000;i++)
                {
                    incount () ;
                }
            }
            
        });
        
        
        Thread t2 = new Thread (new Runnable(){
           @Override
           public void run(){
               for(int i=0;i<1000;i++)
                   incount();
           }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(joinSynchronized.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Count = " + count);
        
    }
    
}

