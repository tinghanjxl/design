package single;

import org.apache.log4j.Logger;
import org.junit.Test;
public class CustomerDataChart {
	CustomerDAO dao=new CustomerDAO();
	Logger logger=Logger.getLogger(CustomerDataChart.class);
	@Test
	public void createChart()
	{
		
		//System.out.println("�����û���Ϣ��ɹ���");
		logger.info("��ѩ��09�����û���Ϣ��ɹ���");
	}
	@Test
	public void displayChart()
	{
		dao.findCustomer();  //�����û����������ͼ��
		//System.out.println("������ʾ�û���Ϣ��");
		logger.info("��ѩ��09������ʾ�û���Ϣ��");
	}
}
