/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc295_project2;

/**
 * Rachel Sillas
 * Lilibeth Blandon
 * CSC 295: Project 2
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Driver {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner keyboard = new Scanner(System.in);
        int MAX = 10000;
        SpecialNumbers [] specialNumbers = new SpecialNumbers[MAX];
        ConcurrentLinkedQueue<Task> taskQueue = new ConcurrentLinkedQueue<Task>();
        LinkedBlockingQueue<Result> resultQueue = new LinkedBlockingQueue<Result>();
        
        
        for(int i=0; i<specialNumbers.length; i++)
        {
            specialNumbers[i] = new SpecialNumbers();
        }
        
        System.out.print("Enter number of threads: ");
        int numberOfThreads = keyboard.nextInt();
        //int numberOfThreads = 8;
        
        
        System.out.print("Enter number of subtasks: ");
        int numberOfSubtasks = keyboard.nextInt();
        //int numberOfSubtasks = 500;
        System.out.println();
        
        System.out.println("\nFinding objects satisfying the 4 constraints using " + numberOfThreads + " threads and " + numberOfSubtasks + " subtasks..\n");
        
        int numberOfTasks = MAX/numberOfSubtasks;
        
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTasks; i++)
        {
            int start = (i * numberOfSubtasks + 1)-1;
            int end = ((i + 1) * numberOfSubtasks)-1;
            taskQueue.add(new Task(start, end, specialNumbers , resultQueue));
        }
        
        NumberThread [] workers = new NumberThread[numberOfThreads];
        for (int i = 0; i < workers.length; i++)
            workers[i] = new NumberThread(taskQueue);
        
        for (int i = 0; i < numberOfThreads; i++)
            workers[i].start();

        
        double minVariance = Double.MAX_VALUE; //Largest variance
        SpecialNumbers whichObject = null;
        for(int i=0; i<numberOfTasks; i++)
        {
            Result result = resultQueue.take();
            if(result.getSpecialNumber() != null && result.getSpecialNumber().getVariance() < minVariance)
            {
                minVariance = result.getSpecialNumber().getVariance();
                whichObject = result.getSpecialNumber();
            }
        }

        
        long elapsedTime = System.currentTimeMillis() - startTime;
        
        System.out.println("Object(s) that satisfy the 4 following constraints");
        System.out.println("1. nonPrimeNum is not a prime number");
        System.out.println("2. primeNum is a prime number");
        System.out.println("3. perfectNum is a perfect number");
        System.out.println("4. Variance of above three numbers is the smallest among all objects.");
        
        if(whichObject != null) {
            System.out.println("\n" + whichObject.toString());
        }
        else
            System.out.println("(0): No object following the constraints");
        
        System.out.println("\nTotal elapsed time:  " + (elapsedTime / 1000.0) + " seconds.\n");
    }
}