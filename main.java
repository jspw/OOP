/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathreads;

/**
 *
 * @author jacksparrow
 */
/*
4 arrays !
Add 1st 2 arrays in a another sum1 array
Add other 2 arrays in another sum2 array
add the sum arrays

use multi threading

*/

public class main {

    public static void main(String[] args) {
        int[] aray1 = {1, 2, 3, 4, 5};
        int[] aray2 = {6, 7, 8, 9, 10};
        int[] sum1=new int[5];
        int[] finalsum=new int[5];
        doSum obj = new doSum();
        Thread a=new Thread(obj);
        a.start();
        for (int i = 0; i < 5; i++) {
            sum1[i]=aray1[i]+aray2[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
        try {
            a.join();
        } catch (InterruptedException e) {
           
        }
        System.out.println("Sum Array of four arrays:");
        for(int i=0;i<5;i++)
        {
            finalsum[i]=sum1[i]+obj.sum2[i];
            System.out.print(finalsum[i]+" ");
        }
        System.out.println("");
       
    }
}
