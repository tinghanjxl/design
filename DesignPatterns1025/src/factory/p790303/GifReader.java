package factory.p790303;

import org.apache.log4j.Logger;

public class GifReader implements IImageReader {
	
	Logger logger=Logger.getLogger(GifReader.class);
	public void readImage() {
		
		logger.info("贾雪磊的GIF图片读取器正在工作！");

	}

}
