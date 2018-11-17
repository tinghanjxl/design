package factory;

import org.apache.log4j.Logger;

public class FileLogFactory implements ILogFactory {
	
	Logger logger=Logger.getLogger(FileLogFactory.class);
	public ILog createLog() {
		//生产文件日志，里氏代换
		return new FileLog();
	}

}
