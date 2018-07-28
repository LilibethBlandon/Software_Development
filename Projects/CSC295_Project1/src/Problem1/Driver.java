/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/*
    Lilibeth Blandon
    CSC292-01
    Project 1: Problem 1
    About: Create a calendar class to display a calendar of a specific year the user inputs.
    Class: Driver.java
*/

/**
 *
 * @author lily
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = keyboard.nextInt();
        System.out.println();
        
        MyCalendar m = new MyCalendar(year);
        m.displayWholeYear();
        //System.out.println(m.getStartingDay());
    }
    
}
