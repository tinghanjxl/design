package single;

import org.apache.log4j.Logger;
import org.junit.Test;
public class CustomerDAO {
	DBUtil dbutil=new DBUtil();
	Logger logger=Logger.getLogger(CustomerDAO.class);
	public void findCustomer()
	{	//�����û�ǰ��Ҫ�������ݿ�
		
		dbutil.getConnection();
		//System.out.println("�ɹ������û���Ϣ��");
		logger.info("��ѩ��09�ɹ������û���Ϣ��");
	}
}
