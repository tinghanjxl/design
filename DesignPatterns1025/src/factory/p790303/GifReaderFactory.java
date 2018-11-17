package factory.p790303;

import org.apache.log4j.Logger;

public class GifReaderFactory implements IImageReaderFactory {

	Logger logger=Logger.getLogger(GifReaderFactory.class);
	public IImageReader createImageReader() {
		// TODO Auto-generated method stub
		logger.info("贾雪磊的GIF工厂正在生成GIF图片读取器");
		return new GifReader();
	}

}
