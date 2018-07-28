/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc295_project2;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Random;

/**
 * Rachel Sillas
 * Lilibeth Blandon
 * CSC 295: Project 2
 */
public class SpecialNumbers {

    private int nonPrimeNum;
    private int primeNum;
    private int perfectNum;

    public SpecialNumbers() {
        Random r = new Random();
        this.nonPrimeNum = r.nextInt(10000) + 1;
        this.primeNum = r.nextInt(10000) + 1;

        int prob = r.nextInt(100) + 1;
        if(prob <= 30) //30%
            this.perfectNum = r.nextInt(50) + 1;
        else if(prob >30 && prob <=80) //50%
            this.perfectNum = r.nextInt(400) + 51;
        else if(prob > 80 && prob <= 100) //20%
            this.perfectNum = r.nextInt(50) + 451;
    }

    public int getNonPrimeNum() {
        return nonPrimeNum;
    }

    public int getPrimeNum() {
        return primeNum;
    }

    public int getPerfectNum() {
        return perfectNum;
    }
    
    
    public boolean checkNonPrimeNumberIsNotAPrime() {
        if (nonPrimeNum == 0 || nonPrimeNum == 1) {
            return false;
        }

        for (int i = 2; i <= sqrt(nonPrimeNum); i++) {
                if (nonPrimeNum % i == 0) //Non Prime Number
                {
                    return false;
                }
        }
            return true; //prime number
    }
    
    
    public boolean checkPrimeNumberIsAPrimeNumber() {
        if (primeNum == 0 || primeNum == 1) {
            return false;
        }
        
        for (int i = 2; i <= sqrt(primeNum); i++) {
            if (primeNum % i == 0) //Non Prime Number
            {
                return false;
            }
        }
        return true; //prime number
    }
    
    public ArrayList<Integer> listDivisors(int n)
    {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                a.add(i);
            }
        }
        return a;
    }
    
    public boolean isItPerfectNum()
    {
        ArrayList<Integer> divisors = new ArrayList<>();
        divisors = listDivisors(this.perfectNum);
        int sum=0;
        for(int i=0; i<divisors.size(); i++)
        {
            sum+=divisors.get(i);
        }
        
        if(sum == this.perfectNum) {
            //System.out.println("Sum = " + sum + " and perfect num is " + this.perfectNum);
            return true;
        }
        else
            return false;
    }
    
    public double getVariance()
    {
        double average = (this.nonPrimeNum + this.primeNum + this.perfectNum)/3.0;
        return (Math.pow(this.nonPrimeNum-average,2) + Math.pow((this.primeNum-average), 2) + Math.pow((this.perfectNum-average), 2))/2.0;
    }

    @Override
    public String toString() {
        return "SpecialNumbers{" + "nonPrimeNum=" + nonPrimeNum + ", primeNum=" + primeNum + ", perfectNum=" + perfectNum + ", variance=" + Math.round(this.getVariance()) + '}';
    }
    
    
    
    
}
