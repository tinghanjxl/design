package simplefactory;

import org.apache.log4j.Logger;

public class Circle implements IShape {

	Logger logger=Logger.getLogger(Circle.class);
	
	public void draw() {
		
		logger.info("��ѩ�ڻ��˸�Բ");
	}

	
	public void erase() {
		
		logger.info("��ѩ��ɾ����Բ");

	}

}
