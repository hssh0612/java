package shape;

public class Rectangle extends Square {
	
	public Rectangle( int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		for(int i=1; i<=getHeight(); i++) {
			for(int j =1; j<=getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
}
