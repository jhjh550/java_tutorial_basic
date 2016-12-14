
public class Triangle extends TwoDimenShape{
	int width, height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public float getArea(){
		return width*height*0.5f;
	}
	
}
