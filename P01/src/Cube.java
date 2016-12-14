
public class Cube extends ThreeDimenShape{

	int width, height, length;
	
	
	public Cube(int width, int height, int length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}


	@Override
	public float getVolume() {
		return width*height*length;
	}

}
