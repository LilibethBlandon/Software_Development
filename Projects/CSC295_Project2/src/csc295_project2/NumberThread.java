/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc295_project2;

import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * Rachel Sillas
 * Lilibeth Blandon
 * CSC 295: Project 2
 */

public class NumberThread extends Thread{
    private ConcurrentLinkedQueue<Task> taskQueue;
    
    public NumberThread(ConcurrentLinkedQueue<Task> taskQueue)
    {
        this.taskQueue = taskQueue;
    }
    public void run()
    {
        while(true)
        {
            Task task = taskQueue.poll();
            if (task == null)
		break;
            task.compute();
        }
    }
        
}
