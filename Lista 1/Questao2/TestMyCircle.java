public class TestMyCircle {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(2, 2);
		MyCircle c1 = new MyCircle(2, 2, 3);
		MyCircle c2 = new MyCircle(p1, 3);
		
		System.out.println(c1.getCenterX() + " " + c1.getCenterY() + " " + c1.getCenter());
		
		c1.setCenter(p1);
		c1.setRadius(4);
		c1.setCenterXY(3, 3);
		
		System.out.println(c1.getArea());
		System.out.println(c2.toString());
		
		MyCircle c3 = new MyCircle(1, 1, 1);
		MyCircle c4 = new MyCircle(1, 1, 1);
		
		System.out.println("\n" + c3.equals(c4));
		
		c4.setCenterXY(3, 3);
		
		System.out.println(c3.equals(c4));
	}

}
