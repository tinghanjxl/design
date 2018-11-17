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
		logger.info("��ѩ�����ɵ������"+t2);
		//�����ĳ���ӿ�
		ILogFactory ifactory;
		 //��Ʒ�ĳ���
		ILog ilog;
		//���ɾ��幤�������ϴ���
		ifactory=(ILogFactory)xm.getObject("src/factory.xml");
		//���幤��������Ʒ
		ilog=ifactory.createLog();
		//��Ʒ��ʼ����
		ilog.writeLog();
				
	}
}
