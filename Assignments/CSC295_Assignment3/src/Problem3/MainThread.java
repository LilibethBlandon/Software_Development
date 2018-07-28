/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.util.Scanner;

/**
 * Lilibeth Blandon
 * Assignment 3
 * CSC 295
 */
public class MainThread {
    public static void main(String [] args) throws InterruptedException
    {
        Scanner keyboard = new Scanner(System.in);
        final int MAX = 10000;
        System.out.print("Enter number of threads: ");
        int numberOfThreads = keyboard.nextInt();
        int divisions = MAX/numberOfThreads;
        int leftOver = MAX%numberOfThreads;
        
        PrimeThread [] p = new PrimeThread[numberOfThreads];
        long startTime = System.nanoTime();
        for(int i=0; i<numberOfThreads; i++)
        {
            int start = i * divisions + 1;
            int end = (i + 1) * divisions;
            p[i] = new PrimeThread(start, end, (i+1));
        }
        p[p.length-1].setMax(leftOver);
        
//        for(int i=0; i<numberOfThreads; i++)
//            System.out.println(p[i].toString());
        
        
        for(int i=0; i<numberOfThreads; i++)
            p[i].start();
            
        for(int i=0; i<numberOfThreads; i++)
            p[i].join();
        
        
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("\n");
		System.out.println("Largest Prime between [1-10000] : " + PrimeThread.maxPrime_Overall);
		System.out.println("Total elapsed time:  " + elapsedTime + " ns");
        
    }
}
