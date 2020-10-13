package sphere;

public class VolandArea {
	private double radius;

	public VolandArea(double radius) {
		super();
		this.radius = radius;
	}
	
	double vol()
	{
	    double v=4*Math.PI*radius*radius;
		return v;
	}
	
	double area()
	{
		double a=4/3*Math.PI*radius*radius;
		return a;
	}

}
