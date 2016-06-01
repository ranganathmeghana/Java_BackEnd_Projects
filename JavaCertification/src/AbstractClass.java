
public abstract class AbstractClass {
	public double area;
	
	public abstract void calculateArea();
	public abstract void display();
	
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.setBreadth(10.0);
		obj.setLength(20.0);
		obj.calculateArea();
		
    }
}

class Rectangle extends AbstractClass
{
	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public void calculateArea(){
		area=getLength()*getBreadth();
		System.out.println(area);
	}
	
	public void display(){
		System.out.println(length);
		System.out.println(breadth);
		System.out.println(area);
	}
}
	class Square extends AbstractClass
	{
		private double side;
		
		
		public double getSide() {
			return side;
		}
		public void setSide(double side) {
			this.side = side;
		}
	
		public void calculateArea(){
			area=getSide()*getSide();
		}
		
		public void display(){
			System.out.println(side);
			System.out.println(area);
		}
	
}
	
	
	