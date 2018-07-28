/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 * Lilibeth Blandon
 * Assignment 3
 * CSC 295
 */
public class PrimeThread extends Thread {
    private int min;
    private int max;
    private int index;
    public static int maxPrime_Overall;
    private ArrayList a = new ArrayList();
    
    public PrimeThread(int min, int max, int index)
    {
        this.min = min;
        this.max = max;
        this.index = index;
    }
    
    public void run() {
        long startTime = System.nanoTime();
        
        int maxPrime = calMaxPrime();
        compare(maxPrime);
        
        System.out.println("id: " + index + "--[" + min + ", " + max + "]"  + ": Max prime = " + maxPrime + "---" + "thread elapsed time: " + (System.nanoTime() - startTime) + " ns");
        
    }

    synchronized private static void compare(int maxPrime) {
        if (maxPrime > maxPrime_Overall) {
                maxPrime_Overall = maxPrime;
        }
    }
    
    public int calMaxPrime()
    {
        for(int i=min; i<=max; i++)
        {
            if(checkPrime(i) && i%10==7)
            {
                a.add(i);
            }
        }
        return (int)(a.get(a.size()-1));
    }
    
    private boolean checkPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getIndex() {
        return index;
    }
    
    public void setMax(int leftOver) {
        max+=leftOver;
    }

    @Override
    public String toString() {
        return "PrimeThread{" + "min=" + min + ", max=" + max + ", index=" + index + '}';
    }
}
