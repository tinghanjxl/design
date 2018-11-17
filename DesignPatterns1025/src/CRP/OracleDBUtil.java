package CRP;

import org.apache.log4j.Logger;
import org.junit.Test;

public class OracleDBUtil extends DBUtil {
	@Test
	public void getConnection()
	{
		Logger logger = Logger.getLogger(OracleDBUtil.class);
		//System.out.println("Oracle数据库连接成功！");
		logger.info("贾雪磊09Oracle数据库连接成功");
	}
}
