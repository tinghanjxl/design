package factory;
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
		long t2=r1.nextLong();
		logger.info("贾雪磊生成的随机数"+t2);
		//工厂的抽象接口
		ILogFactory ifactory;
		 //产品的抽象
		ILog ilog;
		//生成具体工厂，里氏代换
		ifactory=(ILogFactory)xm.getObject("src/factory.xml");
		//具体工厂生产产品
		ilog=ifactory.createLog();
		//产品开始工作
		ilog.writeLog();
				
	}
}
