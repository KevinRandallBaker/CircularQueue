/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc311_que;

/**
 *
 * @author CSC-Student
 */
public class CSC311_Que {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CircularQue<Integer> q = new CircularQue<Integer>(4);
       
		/*
		 * myQ.offer(10); System.out.println(myQ); myQ.offer(20);
		 * System.out.println(myQ); myQ.offer(15); System.out.println(myQ);
		 * System.out.print("[Removing from front: " + myQ.poll() + "] ");
		 * System.out.println(myQ); myQ.offer(88); System.out.println(myQ);
		 * System.out.print("Trying to add to full list...... "); myQ.offer(99);
		 * System.out.println(myQ);
		 * 
		 * System.out.println("Removing from front: " + myQ.poll());
		 * System.out.println(myQ); System.out.println("Removing from front: " +
		 * myQ.poll()); System.out.println(myQ);
		 */

        q.offer(3); System.out.println(q);
        q.offer(8); System.out.println(q);
        q.offer(6); System.out.println(q);
        q.poll(); System.out.println(q);
        q.offer(9); System.out.println(q);
        q.poll(); System.out.println(q);
        q.offer(2); System.out.println(q);
        q.offer(12); System.out.println(q);
    }
   
}