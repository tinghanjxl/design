package factory.p790303;

public interface IImageReaderFactory {
	//抽象生产方法（规范，具体生产由后代完成）
	public IImageReader createImageReader();

}
