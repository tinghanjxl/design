package factory.p790303;

import org.apache.log4j.Logger;

public class JpgReaderFactory implements IImageReaderFactory {

	Logger logger=Logger.getLogger(JpgReaderFactory.class);
	public IImageReader createImageReader() {
		// TODO Auto-generated method stub
		logger.info("贾雪磊的JPG工厂正在生成JPG图片读取器");
		return new JpgReader();
	}

}
