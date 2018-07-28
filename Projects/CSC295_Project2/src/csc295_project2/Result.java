/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc295_project2;

import java.util.ArrayList;

/**
 * Rachel Sillas
 * Lilibeth Blandon
 * CSC 295: Project 2
 */

public class Result {
    private SpecialNumbers specialNumber;
    
    public Result(SpecialNumbers specialNumber)
    {
        this.specialNumber = specialNumber;
    }

    public SpecialNumbers getSpecialNumber() {
        return specialNumber;
    }

    public void setSpecialNumber(SpecialNumbers specialNumber) {
        this.specialNumber = specialNumber;
    }
    
}
