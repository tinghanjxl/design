package simplefactory;

import org.apache.log4j.Logger;

public class Rectangle implements IShape {

	Logger logger=Logger.getLogger(Rectangle.class);
	public void draw() {
		logger.info("��ѩ�ڻ��˸�����");
		
	}


	public void erase() {
		
		
		logger.info("��ѩ��ɾ���˾���");
		

	}

}
