
public class Triangle extends Shapes {
	private double height; 
	Triangle(double x, double y, double h){			
	super(x, y);			
	height = h;		
	}					
	double area(){ 			
	System.out.println("For Triangle");			
	return breadth * height/2;	
	}
}
