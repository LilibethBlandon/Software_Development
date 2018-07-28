/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Lilibeth Blandon
 * Assignment 3
 * CSC 295
 */
public class LoadBalancingPrimeDriver {
    public static void main(String [] args) throws InterruptedException
    {
        Scanner keyboard= new Scanner(System.in);
        final int MAX = 10000;

        // A queue to hold the tasks
        ConcurrentLinkedQueue<Task> taskQueue = new ConcurrentLinkedQueue<Task>();
        //A queue to hold the results from the tasks
        LinkedBlockingQueue<Result> resultQueue = new LinkedBlockingQueue<Result>();
        
        System.out.print("Enter number of threads: ");
        int numberOfThreads = keyboard.nextInt();
        int divisions = MAX/numberOfThreads;
        int leftOver = MAX%numberOfThreads;
        

        System.out.println("\nCounting divisors using " + numberOfThreads + " threads...");

        long startTime = System.currentTimeMillis();
        
        int numberOfTasks = MAX / 1000;
        
        for (int i = 0; i < numberOfTasks; i++) {
            int start = i * 1000 + 1;
            int end = (i + 1) * 1000;
            taskQueue.add(new Task(start, end, resultQueue));
        }

        GetLargestPrimeThread[] workers = new GetLargestPrimeThread[numberOfThreads];
            for (int i = 0; i < workers.length; i++)
		workers[i] = new GetLargestPrimeThread(taskQueue);
        
        for (int i = 0; i < numberOfThreads; i++)
            workers[i].start();
        
        int maxPrimeNumber = 0; // Over maximum found by any task.
        for (int i = 0; i < numberOfTasks; i++) {
            Result result = resultQueue.take();
            if (result.getMaxPrimefromTask() > maxPrimeNumber) {
                    maxPrimeNumber = result.getMaxPrimefromTask();
            }
        }
        
        
        long elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("\nThe largest prime number ending with 7 " + "for numbers between 1 and " + MAX + " is " + maxPrimeNumber);
		System.out.println("Total elapsed time:  " + (elapsedTime / 1000.0) + " seconds.\n");
        
    }
}
