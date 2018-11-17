package CRP;

import org.junit.Test;

public class CustomerDao {
	DBUtil util;
	@Test
	public void run()
	{
		CustomerDao cd=new CustomerDao();
		cd.addCustomers();
	}
	public void addCustomers()
	{
		util=new OracleDBUtil();
		util.getConnection();
	}
}
