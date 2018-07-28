/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/**
 *
 * @author lily
 */
public class MyPolynomial
{
    private double [] coeffs;
    
    public MyPolynomial(double [] coeffs)
    {
        this.coeffs = coeffs;
    }
    public int getDegree()
    {
        return coeffs.length-1;
    }
    public String toString()
    {
        String polynomial="";
        for(int i=0; i<coeffs.length; i++)
        {
            if(i==coeffs.length-1)
                polynomial += "(" +coeffs[i] + "x^" + ((coeffs.length-1)-i) + ")";
            else
                polynomial += "(" +coeffs[i] + "x^" + ((coeffs.length-1)-i) + ") + ";
        }
        return polynomial;
    }
    public double evaluate(double x)
    {
        int answer=0;
        for(int i=0; i<coeffs.length; i++)
        {
            answer+=coeffs[i]*Math.pow(x, (coeffs.length-1)-i);
        }
        return answer;
    }
    public MyPolynomial add(MyPolynomial right)
    {
        int size1 = this.coeffs.length;
        int size2 = right.getCoeffs().length;
        double [] c = new double[Math.max(size1, size2)];

          int i=size2-1;
          int counter=c.length-1;
          while(i>=0)
          {
              c[counter] += right.getCoeffs()[i];
              counter--;
              i--;
          }
          int j=size1-1;
          int counter2=c.length-1;
          while(j>=0)
          {
              c[counter2] += this.coeffs[j];
              counter2--;
              j--;
          }
        
      
        MyPolynomial addedArray = new MyPolynomial(c);
        return addedArray;
    }
    public double [] getCoeffs()
    {
        return coeffs;
    }
    public void setCoeffs(double [] coeffs)
    {
        this.coeffs = coeffs;
    }
}
