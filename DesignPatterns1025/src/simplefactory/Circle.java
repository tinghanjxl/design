package simplefactory;

import org.apache.log4j.Logger;

public class Circle implements IShape {

	Logger logger=Logger.getLogger(Circle.class);
	
	public void draw() {
		
		logger.info("¼ÖÑ©ÀÚ»­ÁË¸öÔ²");
	}

	
	public void erase() {
		
		logger.info("¼ÖÑ©ÀÚÉ¾³ıÁËÔ²");

	}

}
