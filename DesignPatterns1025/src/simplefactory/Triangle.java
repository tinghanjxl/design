package simplefactory;

import org.apache.log4j.Logger;

public class Triangle implements IShape {

	Logger logger=Logger.getLogger(Triangle.class);

	public void draw() {
		
		logger.info("��ѩ�ڻ��˸�������");
	}

	
	public void erase() {
	
		logger.info("��ѩ��ɾ����������");

	}

}
