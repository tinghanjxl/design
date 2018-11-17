package factory;
import org.apache.log4j.Logger;

public class DatabaseLog implements ILog {

	Logger logger=Logger.getLogger(DatabaseLog.class);
	public void writeLog() {
		logger.info("贾雪磊的数据库日志记录器正在工作中！");
	}

}
