package p68;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class ReadXML {
	 public static String getChartType() {
	        try {
	        	//�����ĵ�����
	            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = dFactory.newDocumentBuilder();
	            Document doc;							
	            doc = builder.parse(new File("src//p68//p69.xml")); 
			
	            //��ȡ�������������͵��ı����
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