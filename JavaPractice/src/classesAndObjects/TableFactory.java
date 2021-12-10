package classesAndObjects;

public class TableFactory {

	private String color;
	private double height;
	private String shape;
	//private static int count = 0;
	
	public TableFactory() {
		
	}
	
	public TableFactory(String color, double height, String shape) {
		super();
		this.color = color;
		this.height = height;
		this.shape = shape;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void adjustHeight(double adjustmentNumber) {
		height = height+adjustmentNumber;
	}
	
	public void changeColor(String newColor) {
		color = newColor;
	}
	
	public void printSate() {
		System.out.println("color:"+color+"\n"
				+"height:"+height+"cm\n"
				+"shape:" + shape);		
	}
}
