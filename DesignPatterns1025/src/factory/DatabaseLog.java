package factory;
import org.apache.log4j.Logger;

public class DatabaseLog implements ILog {

	Logger logger=Logger.getLogger(DatabaseLog.class);
	public void writeLog() {
		logger.info("��ѩ�ڵ����ݿ���־��¼�����ڹ����У�");
	}

}
