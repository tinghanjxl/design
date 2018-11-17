package factory.p790303;

import java.util.Random;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.junit.Test;
import util.XMLUtil;

public class Client {
	XMLUtil xm=new XMLUtil();
	long t=System.currentTimeMillis()+2016144209;
	Random r1=new Random(t);
	Logger logger=Logger.getLogger(Client.class);
	@Test
	public void test() throws InstantiationException, IllegalAccessException, ClassNotFoundException, DocumentException
	{
		long t1=r1.nextLong();
		logger.info(t1);
		IImageReaderFactory imageReaderFactory;
		IImageReader imageReader;
		imageReaderFactory=(IImageReaderFactory) xm.getObject("src/imageFactory.xml");
		imageReader=imageReaderFactory.createImageReader();
	}
}
