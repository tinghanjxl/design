package factory;

import org.apache.log4j.Logger;

public class FileLogFactory implements ILogFactory {
	
	Logger logger=Logger.getLogger(FileLogFactory.class);
	public ILog createLog() {
		//�����ļ���־�����ϴ���
		return new FileLog();
	}

}
