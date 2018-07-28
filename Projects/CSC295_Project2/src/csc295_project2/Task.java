/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc295_project2;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * Rachel Sillas
 * Lilibeth Blandon
 * CSC 295: Project 2
 */

public class Task {
    private int min;
    private int max;
    private SpecialNumbers [] specialNumbers;
    private LinkedBlockingQueue<Result> resultQueue = new LinkedBlockingQueue<Result>();
    
    public Task(int min, int max, SpecialNumbers [] specialNumbers, LinkedBlockingQueue<Result> resultQueue)
    {
        this.min = min;
        this.max = max;
        this.specialNumbers = specialNumbers;
        this.resultQueue = resultQueue;
    }
    
//    public void compute()
//    {
//        SpecialNumbers whichObject = specialNumbers[min];
//        double minVariance = specialNumbers[min].getVariance();
//        double variance = specialNumbers[min].getVariance();
//        if(specialNumbers[min].checkNonPrimeNumberIsNotAPrime() == false && specialNumbers[min].checkPrimeNumberIsAPrimeNumber() == true && specialNumbers[min].isItPerfectNum() == true)
//        {
//            if(variance <= minVariance)
//            {
//                //minVariance = variance;
//                whichObject = specialNumbers[min];
//            }
//        }
//        for(int i=min+1; i<=max; i++)
//        {
//            variance = specialNumbers[i].getVariance();
//            if(specialNumbers[i].checkNonPrimeNumberIsNotAPrime() == false && specialNumbers[i].checkPrimeNumberIsAPrimeNumber() == true && specialNumbers[i].isItPerfectNum() == true)
//            {
//                if(variance <= minVariance)
//                {
//                    //minVariance = variance;
//                    whichObject = specialNumbers[i];
//                }
//            }
//        }
//        resultQueue.add(new Result(whichObject));
//        
//    }
//    public void compute()
//    {
//        ArrayList<SpecialNumbers> n = new ArrayList<>();
//        SpecialNumbers whichObject = null;
//        n = getAllSatisfiedObjects();
//        if(n.size() != 0) {
//            double minVariance = n.get(0).getVariance();
//            for(int i=1; i<n.size(); i++)
//            {
//                double variance = n.get(i).getVariance();
//                if(variance <= minVariance)
//                {
//                    minVariance = variance;
//                    whichObject = n.get(i);
//                }
//            }
//            resultQueue.add(new Result(whichObject));
//        }
//        else
//            resultQueue.add(new Result(null));
//    }
//    private ArrayList<SpecialNumbers> getAllSatisfiedObjects()
//    {
//        ArrayList<SpecialNumbers> s = new ArrayList<>();
//        for(int i=min; i<=max; i++)
//        {
//            if(specialNumbers[i].checkNonPrimeNumberIsNotAPrime() == false && specialNumbers[i].checkPrimeNumberIsAPrimeNumber() == true && specialNumbers[i].isItPerfectNum() == true)
//            {
//                s.add(specialNumbers[i]);
//            }
//        }
//        return s;
//    }
    
    
    public void compute()
    {
        ArrayList<SpecialNumbers> n = new ArrayList<>();
        double minVariance = Double.MAX_VALUE;
        SpecialNumbers whichObject = null;
        for(int i=min; i<=max; i++)
        {
            if(specialNumbers[i].checkNonPrimeNumberIsNotAPrime() == false && specialNumbers[i].checkPrimeNumberIsAPrimeNumber() == true && specialNumbers[i].isItPerfectNum() == true && specialNumbers[i].getVariance() <= minVariance)
            {
               minVariance = specialNumbers[i].getVariance();
               whichObject = specialNumbers[i];
            }
        }
        resultQueue.add(new Result(whichObject));
        
    }
}
