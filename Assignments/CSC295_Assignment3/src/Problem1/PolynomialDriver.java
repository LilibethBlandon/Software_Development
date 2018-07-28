/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/**
 * Lilibeth Blandon
 * Assignment 3
 * CSC 295
 */
public class PolynomialDriver {
    public static void main(String [] args)
    {
        double [] arr = {4,5,3,2,1};
        MyPolynomial p = new MyPolynomial(arr);
        System.out.println("first array: " + p.toString());
        //System.out.println(p.evaluate(2));
        
        double [] arr2 = {9,3,4};
        MyPolynomial q = new MyPolynomial(arr2);
        System.out.println("second array: " + q.toString());
        System.out.println("\nfirst + second array: "+ p.add(q).toString());
        
    }
}
