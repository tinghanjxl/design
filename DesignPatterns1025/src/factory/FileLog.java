package factory;

import org.apache.log4j.Logger;

public class FileLog implements ILog {
	Logger logger=Logger.getLogger(FileLog.class);

	public void writeLog() {
		
		logger.info("��ѩ�ڵ��ļ���־��¼�����ڹ����У�");
	}

}
