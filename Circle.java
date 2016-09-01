import java.text.NumberFormat;

public class Circle {

	public double radius;
	public double Area;
	public double Circumference;
	private static int objectCount = 0;
	

	public  Circle(double radius){
	 return;
		
	}
public Circle() {
		// TODO Auto-generated constructor stub
		radius = 0;
		//objectCount++;
	}

	public Circle(double radius, double circumference, double area)   
    { 
        this.radius = radius;
        this.Area = Area;
        this.Circumference = Circumference;
        
    }

	public double getCircumference(){
		Circumference =   2*Math.PI*radius;
		return Circumference;
	}
	
	public String getFormattedCircumference(){
		return formatNumber(getCircumference());
	}
	
	public double getArea( ) {
	   Area = Math.PI*(radius*radius);
	   return Area;
	}
	
	
	public String getFormattedArea(){
		return formatNumber(getArea());
	}
	
	public String formatNumber(double x){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String format = number.format(x);
		return format;
	}
	
	public static int getObjectCount(){
	return objectCount;
	}
	public static int incrementObjectCount(){
		return objectCount++;
		}
	
}
