package p68;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class ReadXML {
	 public static String getChartType() {
	        try {
	        	//创建文档对象
	            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = dFactory.newDocumentBuilder();
	            Document doc;							
	            doc = builder.parse(new File("src//p68//p69.xml")); 
			
	            //获取包含操作符类型的文本结点
	            NodeList nl = doc.getElementsByTagName("name");
	            Node classNode = nl.item(0).getFirstChild();
	            String s = classNode.getNodeValue().trim();
	            return s;
	        }   
	        catch(Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

}