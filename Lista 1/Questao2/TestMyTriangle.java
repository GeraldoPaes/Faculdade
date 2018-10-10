public class TestMyTriangle {

	public static void main(String[] args) {
		
		MyTriangle t1 = new MyTriangle(2, 2, 2, 3, 4, 4);
		
		MyPoint p1 = new MyPoint(2, 2);
		MyPoint p2 = new MyPoint(2, 3);
		MyPoint p3 = new MyPoint(4, 4);
		
		MyTriangle t2 = new MyTriangle(p1, p2, p3);
		
		System.out.println(t1.toString());
		System.out.println("\n" + t2.getPerimeter());
		
		System.out.println("\n" + t1.equals(t2));
		
		t2.setV1(1, 1);
		
		System.out.println(t1.equals(t2));
		
	}

}
