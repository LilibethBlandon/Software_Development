/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/ */
/*
Lilibeth Blandon
CSC 295
ASSIGNMENT 2
*/


package Problem1;

/**
 *
 * @author jorge
 */
public class Driver {
    
    public static void main(String[] args){
    MyPoint point = new MyPoint(1, 2);
    MyCircle c = new MyCircle(point, 5);
    
    System.out.println(c.toString());
    System.out.println("The area of this circle is:" + c.getArea());
    System.out.println("The circumference of this circle is:" + c.getCircumference());
    
    MyPoint point2 = new MyPoint(5, 7);
    MyCircle p = new MyCircle(point2, 2);
    System.out.println("Distance between these two points are: " + point.distance(point2));
    
    
    MyTriangle triangle = new MyTriangle(0, 0, 1, 2, 5, 7);
    System.out.println(triangle.toString());
    System.out.println("Perimeter of this Triangle is " + triangle.getPerimeter());
    System.out.println("The type of triangle is " + triangle.getType());
    
    }
}
