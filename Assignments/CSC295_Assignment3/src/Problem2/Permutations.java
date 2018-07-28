/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lilibeth Blandon
 * Assignment 3
 * CSC 295
 */

//REFERENCE from stackoverflow but modified to use an arraylist instead as well as adding some other methods
//https://stackoverflow.com/questions/2799078/permutation-algorithm-without-recursion-java
public class Permutations {
    
    public static ArrayList<String> permutations(String s)
    { 
        ArrayList<Integer> p = new ArrayList<>(s.length()+1);
        p.add(1);
        for(int i=1; i<=s.length(); i++)
        {
         //   System.out.println(p.get(i-1) * i);
            p.add(i, p.get(i-1) * i);
        }
        ArrayList<String> q = new ArrayList<>();
        int numOfPermutations = numberOfPermutations(s.length());
        
        for (int i = 0; i < p.get(s.length()); i++) {
            String onePermutation="";
            String temp = s;
            int positionCode = i;
            for (int position = s.length(); position > 0 ;position--){
                int selected = positionCode / p.get(position-1);
                onePermutation += temp.charAt(selected);
                positionCode = positionCode % p.get(position-1);
                temp = temp.substring(0,selected) + temp.substring(selected+1);
            }
            System.out.println(onePermutation);
        }
        return q;
    }
    
    public static String swap(String a, int i, int j)
    {
        char[] c = a.toCharArray();
        
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        
        return String.valueOf(c);
    }
    
    public static int numberOfPermutations(int n)
    {
        if(n==1)
            return 1;
        return numberOfPermutations(n-1) * n;
    }
    
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        String str = "";
        System.out.print("What is the size of the list: ");
        int size = keyboard.nextInt();
        System.out.println("Enter a list of different numbers:");
        for(int i=0; i<=size; i++)
            str += keyboard.nextLine();
        
        ArrayList<String> s = permutations(str);
        
        s.toString();

    }
}