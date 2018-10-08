public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public double distance(int x, int y) {
		double a, x1, x2, y1, y2;
		x1 = this.x;
		x2 = x;
		y1 = this.y;
		y2 = y;
		
		a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		return a;
	}
	
	public double distance(MyPoint p) {
		double a, x1, x2, y1, y2;
		x1 = this.x;
		x2 = p.getX();
		y1 = this.y;
		y2 = p.getY();
		
		a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		return a;
	}
	
	public boolean equals(MyPoint p) {
		boolean r;
		
		if(p != null) {
			if(this.x == p.getX() && this.y == p.getY()) {
				r = true;
			}
			else {
				r = false;
			}
		}
		else {
			r = false;
		}
		
		return r;
	}
	
}
