package ch8;

public class Client1 {

	public static void main(String[] args) {
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1=LoadBalancer.getLoadBalancer();
		balancer2=LoadBalancer.getLoadBalancer();
		balancer3=LoadBalancer.getLoadBalancer();
		balancer4=LoadBalancer.getLoadBalancer();
		if(balancer1==balancer2&&balancer2==balancer3&&balancer3==balancer4)
		{
			System.out.println("���������ؾ���������Ψһ�ԣ�");
		}
		balancer1.addServer("s1");
		balancer2.addServer("s2");
		balancer3.addServer("s3");
		balancer4.addServer("s4");
		for(int i=0;i<100;i++)
		{
			String server=balancer1.getServer();
			System.out.println("�ַ���������������"+server);
		}
		
		

	}

}
