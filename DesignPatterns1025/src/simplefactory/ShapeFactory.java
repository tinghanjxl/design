package simplefactory;

public class ShapeFactory {
	public static IShape createShape(String type) throws UnsupportedShapeException
	{
		if(type.equalsIgnoreCase("c"))
		{
			return new Circle();
		}
		else if(type.equalsIgnoreCase("r"))
		{
			return new Rectangle();
		}
		else if(type.equalsIgnoreCase("t"))
		{
			return new Triangle();
			
		}
		else
		{
			throw new UnsupportedShapeException("贾雪磊找不到这种形状");
		}
		
	}

}
