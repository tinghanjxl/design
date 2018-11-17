package simplefactory;

import org.apache.log4j.Logger;

public class Rectangle implements IShape {

	Logger logger=Logger.getLogger(Rectangle.class);
	public void draw() {
		logger.info("贾雪磊画了个矩形");
		
	}


	public void erase() {
		
		
		logger.info("贾雪磊删除了矩形");
		

	}

}
