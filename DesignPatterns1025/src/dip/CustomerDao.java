package dip;

import org.junit.Test;

public class CustomerDao {
	DataConvertor dc;
	@Test
	public void run(){
		CustomerDao cd=new CustomerDao();
		cd.addCustomers();
	}
	public void addCustomers()
	{
		 dc=(DataConvertor)(XMLUtil.getBean());
		 dc.readFile();
	}
}
