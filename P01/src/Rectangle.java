
public class Rectangle extends TwoDimenShape {
	int width, height;

	public Rectangle(int width, int height) {		
		this.width = width;
		this.height = height;
	}
	
	public float getArea(){
		return width*height;
	}
	
}
