package p68;

import java.util.Random;
import org.apache.log4j.Logger;
import org.junit.Test;
public class Test1 {
	
	Logger logger=Logger.getLogger(Test1.class);
	//�������������
	long t=System.currentTimeMillis()+2016144209;
	Random r=new Random(t);
	Calculator ca=new Calculator();
	Operation op;
	//ʵ����xml�ļ��Ķ���
	ReadXML rm=new ReadXML();
	String code=rm.getChartType();
	@Test
	public void show()
	{
		long t2=r.nextLong();
		logger.info("��ѩ�����ɵ������"+t2);
		op=ca.createOperation(code);
		op.setNumberA(5);
		op.setNumberB(8);
		logger.info("��ѩ�ڵ���������"+op.getResult());
	}

}
