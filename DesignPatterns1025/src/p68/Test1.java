package p68;

import java.util.Random;
import org.apache.log4j.Logger;
import org.junit.Test;
public class Test1 {
	
	Logger logger=Logger.getLogger(Test1.class);
	//构建随机数种子
	long t=System.currentTimeMillis()+2016144209;
	Random r=new Random(t);
	Calculator ca=new Calculator();
	Operation op;
	//实例化xml文件的对象
	ReadXML rm=new ReadXML();
	String code=rm.getChartType();
	@Test
	public void show()
	{
		long t2=r.nextLong();
		logger.info("贾雪磊生成的随机数"+t2);
		op=ca.createOperation(code);
		op.setNumberA(5);
		op.setNumberB(8);
		logger.info("贾雪磊的运算结果是"+op.getResult());
	}

}
