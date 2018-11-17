package factory.p790303;

import org.apache.log4j.Logger;

public class JpgReaderFactory implements IImageReaderFactory {

	Logger logger=Logger.getLogger(JpgReaderFactory.class);
	public IImageReader createImageReader() {
		// TODO Auto-generated method stub
		logger.info("��ѩ�ڵ�JPG������������JPGͼƬ��ȡ��");
		return new JpgReader();
	}

}
