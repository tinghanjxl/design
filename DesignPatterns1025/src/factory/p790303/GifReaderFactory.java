package factory.p790303;

import org.apache.log4j.Logger;

public class GifReaderFactory implements IImageReaderFactory {

	Logger logger=Logger.getLogger(GifReaderFactory.class);
	public IImageReader createImageReader() {
		// TODO Auto-generated method stub
		logger.info("��ѩ�ڵ�GIF������������GIFͼƬ��ȡ��");
		return new GifReader();
	}

}
