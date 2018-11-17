package dip;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLUtil {
	//该方法用于从XML配置文件中提取图表类型，并返回类型名
    public static Object getBean(){
        try {
        	//创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;							
            doc = builder.parse(new File("src/dip/config.xml")); 
		
            //获取包含图表类型的文本结点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String classname = classNode.getNodeValue();
            //System.out.println(classname);
            //通过类名生成实例对象并将其返回
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