package CRP;

import org.apache.log4j.Logger;
import org.junit.Test;

public class OracleDBUtil extends DBUtil {
	@Test
	public void getConnection()
	{
		Logger logger = Logger.getLogger(OracleDBUtil.class);
		//System.out.println("Oracle���ݿ����ӳɹ���");
		logger.info("��ѩ��09Oracle���ݿ����ӳɹ�");
	}
}
