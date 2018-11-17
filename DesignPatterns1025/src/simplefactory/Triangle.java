package simplefactory;

import org.apache.log4j.Logger;

public class Triangle implements IShape {

	Logger logger=Logger.getLogger(Triangle.class);

	public void draw() {
		
		logger.info("贾雪磊画了个三角形");
	}

	
	public void erase() {
	
		logger.info("贾雪磊删除了三角形");

	}

}
