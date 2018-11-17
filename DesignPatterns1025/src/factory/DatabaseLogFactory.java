package factory;

import org.apache.log4j.Logger;

public class DatabaseLogFactory implements ILogFactory {

	Logger logger=Logger.getLogger(DatabaseLogFactory.class);
	public ILog createLog() {
		
		return new DatabaseLog();
	}

}
