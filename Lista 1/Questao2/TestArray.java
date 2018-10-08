public class TestArray {

	public static void main(String[] args) {
		MyPoint[] p = new MyPoint[10];
		
		for(int i = 0; i < 10; i++) {
			p[i] = new MyPoint(i, i);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Ponto " + (i+1) + ":" + p[i].toString());
		}
	}

}
