/*
Lilibeth Blandon
CSC 295
ASSIGNMENT 2
*/

package Problem1;


public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint()
	{
		x=0;
		y=0;
	}
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int[] getXY()
	{
		int [] point = new int[2];
		point[0]=x;
		point[1]=y;
		return point;
	}
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	public double distance(int x, int y)
	{
            
		return Math.sqrt(((this.x)-x) * ((this.x)-x) + ((this.y)-y)*((this.y)-y));
	}
	public double distance(MyPoint another)
	{
		return distance(another.getX(), another.getY());
	}
	public double distance()
	{
		return Math.pow(Math.pow(0-x,2) + Math.pow(0-y, 2), (1.0/2.0));
	}
	
	
}
