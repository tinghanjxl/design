package simplefactory;

import java.util.Random;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Client {
	
	ReadXML readxml=new ReadXML();
	//ͼ�εĳ���ӿ�
	IShape shape;
	//��ȡshape.xml�ļ��е��ַ�
	String code=readxml.getChartType();
	long t=System.currentTimeMillis()+2016144209;
	Logger logger=Logger.getLogger(Client.class);
	Random r1=new Random(t);
	@Test
	public void test() throws UnsupportedShapeException
	{
		//����ȡ���ַ��뷽���еıȽ�
		long t1=r1.nextLong();
		logger.info(t1);
		shape=ShapeFactory.createShape(code);
		shape.draw();
		shape.erase();
		
		
		
	}

}
