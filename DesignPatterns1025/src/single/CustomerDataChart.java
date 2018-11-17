package single;

import org.apache.log4j.Logger;
import org.junit.Test;
public class CustomerDataChart {
	CustomerDAO dao=new CustomerDAO();
	Logger logger=Logger.getLogger(CustomerDataChart.class);
	@Test
	public void createChart()
	{
		
		//System.out.println("创建用户信息表成功！");
		logger.info("贾雪磊09创建用户信息表成功！");
	}
	@Test
	public void displayChart()
	{
		dao.findCustomer();  //查找用户，用来填充图表
		//System.out.println("正在显示用户信息表！");
		logger.info("贾雪磊09正在显示用户信息表！");
	}
}
