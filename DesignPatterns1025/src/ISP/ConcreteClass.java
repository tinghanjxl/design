package ISP;

import org.apache.log4j.Logger;
import org.junit.Test;

public class ConcreteClass implements DataHandler,ChartHandler {
	Logger logger = Logger.getLogger(ConcreteClass.class);
	@Test
	public void dataRead() {
		
		logger.info("贾雪磊09读取数据");
	}
	@Test
	public void createChart() {
		
		logger.info("贾雪磊09创建表");
	}
	@Test
	public void displayChart() {
		
		logger.info("贾雪磊09打印表");;
	}
}
