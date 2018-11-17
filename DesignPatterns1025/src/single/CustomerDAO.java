package single;

import org.apache.log4j.Logger;
import org.junit.Test;
public class CustomerDAO {
	DBUtil dbutil=new DBUtil();
	Logger logger=Logger.getLogger(CustomerDAO.class);
	public void findCustomer()
	{	//查找用户前需要链接数据库
		
		dbutil.getConnection();
		//System.out.println("成功查找用户信息！");
		logger.info("贾雪磊09成功查找用户信息！");
	}
}
