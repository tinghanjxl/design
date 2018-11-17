package simplefactory;

import java.util.Random;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Client {
	
	ReadXML readxml=new ReadXML();
	//图形的抽象接口
	IShape shape;
	//读取shape.xml文件中的字符
	String code=readxml.getChartType();
	long t=System.currentTimeMillis()+2016144209;
	Logger logger=Logger.getLogger(Client.class);
	Random r1=new Random(t);
	@Test
	public void test() throws UnsupportedShapeException
	{
		//将读取的字符与方法中的比较
		long t1=r1.nextLong();
		logger.info(t1);
		shape=ShapeFactory.createShape(code);
		shape.draw();
		shape.erase();
		
		
		
	}

}
