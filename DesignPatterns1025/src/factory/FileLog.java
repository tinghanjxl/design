package factory;

import org.apache.log4j.Logger;

public class FileLog implements ILog {
	Logger logger=Logger.getLogger(FileLog.class);

	public void writeLog() {
		
		logger.info("贾雪磊的文件日志记录器正在工作中！");
	}

}
