public class MyCircle {
	private MyPoint center;
	private int radius = 1;
	
	public MyCircle(int x, int y, int r) {
		this.center.setX(x);
		this.center.setY(y);
		this.radius = r;
	}
	
	public MyCircle(MyPoint center, int r) {
		this.center = center;
		this.radius = r;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return this.center.getX();
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	
	public double getArea() {
		double a;
		
		a = Math.PI * Math.pow(this.getRadius(), 2);
		return a;
	}
	
	public String toString() {
		return "Circle @ (" + this.center.getX() + "," + this.center.getY() + ") radius = " + this.getRadius() + "; area = " + this.getArea();
	}
}
