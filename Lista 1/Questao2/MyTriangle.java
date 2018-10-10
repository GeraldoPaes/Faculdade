public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String getType() {
		double a, b, c;
		
		a = this.v1.distance(v2);
		b = this.v2.distance(v3);
		c = this.v3.distance(v1);
		
		if(a == b && a == c) {
			return "Equilátero";
		}
		else if(a == b || a == c || b == c) {
			return "Isóceles";
		}
		else {
			return "Escaleno";
		}
	}
	
	public String toString() {
		return "MyTriangle " + this.getType() + "@ " + this.v1.toString() + ", " + this.v2.toString() + ", " + this.v3.toString();
	}
	
	public double getPerimeter() {
		double a, b, c;
		
		a = this.v1.distance(v2);
		b = this.v2.distance(v3);
		c = this.v3.distance(v1);
		
		return a + b + c;
	}
	
	public boolean equals(MyTriangle t) {
		boolean r;
		
		if(t != null && this.v1 != null && this.v2 != null && this.v3 != null) {
			if(this.v1.equals(t.v1) && this.v2.equals(t.v2) && this.v3.equals(t.v3)) {
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
