package ISP;

import org.apache.log4j.Logger;
import org.junit.Test;

public class ConcreteClass implements DataHandler,ChartHandler {
	Logger logger = Logger.getLogger(ConcreteClass.class);
	@Test
	public void dataRead() {
		
		logger.info("��ѩ��09��ȡ����");
	}
	@Test
	public void createChart() {
		
		logger.info("��ѩ��09������");
	}
	@Test
	public void displayChart() {
		
		logger.info("��ѩ��09��ӡ��");;
	}
}
