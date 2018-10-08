public class TestMyCircle {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(2, 2);
		MyCircle c1 = new MyCircle(2, 2, 3);
		MyCircle c2 = new MyCircle(p1, 3);
		
		System.out.println(c1.getCenterX() + " " + c1.getCenterY() + " " + c1.getCenter());
	}

}
