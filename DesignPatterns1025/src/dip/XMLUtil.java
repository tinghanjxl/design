package dip;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLUtil {
	//�÷������ڴ�XML�����ļ�����ȡͼ�����ͣ�������������
    public static Object getBean(){
        try {
        	//�����ĵ�����
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;							
            doc = builder.parse(new File("src/dip/config.xml")); 
		
            //��ȡ����ͼ�����͵��ı����
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String classname = classNode.getNodeValue();
            //System.out.println(classname);
            //ͨ����������ʵ�����󲢽��䷵��
            Class c=Class.forName("dip."+classname);
            Object obj=c.newInstance();
            return obj;
          }   
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}