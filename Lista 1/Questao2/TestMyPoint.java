public class TestMyPoint {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		System.out.println(p1.toString());
		
		MyPoint p2 = new MyPoint(1, 1);
		System.out.println(p2.toString());
		
		MyPoint p3 = new MyPoint(2, 2);
		System.out.println(p3.toString());
		
		System.out.print("\n");
		
		System.out.println(p1.getX());
		System.out.println(p2.getY());
		p3.setX(1);
		p3.setY(1);
		System.out.println(p3.getX() + " " + p3.getY());
		
		System.out.println(p2.equals(p3));
		
		p3.setX(2);
		p3.setY(2);
		
		System.out.println(p2.equals(p3));
		
		System.out.print("\n");
		
		System.out.println("Distância: " + p1.distance(5, 5));
		System.out.println("Distância: " + p2.distance(p3));
		
	}

}
