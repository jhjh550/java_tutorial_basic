
public abstract class TwoDimenShape extends Shape{
	public abstract float getArea();	
	
	@Override
	public float getInfo() {
		return getArea();
	}
}
