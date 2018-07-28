/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Lilibeth Blandon
 * Assignment 3
 * CSC 295
 */
public class GetLargestPrimeThread extends Thread {
    private ConcurrentLinkedQueue<Task> taskQueue;
    
    public GetLargestPrimeThread(ConcurrentLinkedQueue<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}
    
    public void run() {
        while (true) {
            Task task = taskQueue.poll();
            if (task == null)
                break;
            task.compute();
        }
    }
    
}
