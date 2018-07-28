/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Lilibeth Blandon
 * Assignment 3
 * CSC 295
 */
public class Task {
    int min;
    int max;
    LinkedBlockingQueue<Result> resultQueue;
    private ArrayList a = new ArrayList();
    
    public Task(int min, int max, LinkedBlockingQueue<Result> resultQueue)
    {
        this.min = min;
	this.max = max;
	this.resultQueue = resultQueue;
    }
    
    public void compute()
    {
        int maxPrime = calMaxPrime();
	resultQueue.add(new Result(maxPrime));
    }
    
    
    //CAL MAX PRIME
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
    
    
    
}
