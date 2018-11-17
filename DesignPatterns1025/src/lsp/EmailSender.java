package lsp;

import org.apache.log4j.Logger;
import org.junit.Test;
public class EmailSender {
	
	Customer customer;
	Logger logger=Logger.getLogger(EmailSender.class);
	@Test
	public void run()
	{
		EmailSender es=new EmailSender();
		es.send(new CommonCustomer());
		es.setEmail("2267754245@qq.com");
		es.setName("��ѩ��");
		es.dispaly();
	}
	public void send(Customer customer) {
		this.customer=customer;
	}

    public void setName(String name) {
		
		customer.setName(name);
		
	}
	public void setEmail(String email)	
	{
		customer.setEmail(email);
		
	}
	public void dispaly()
	{
		logger.info("���� "+customer.email+" ���� "+customer.name);
	}
}
