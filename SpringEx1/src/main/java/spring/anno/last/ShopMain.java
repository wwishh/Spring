package spring.anno.last;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext anno1 = new ClassPathXmlApplicationContext("annoContext4.xml");
		
		JumunController jc = anno1.getBean("jumunController", JumunController.class);
		
		jc.insertJumun("���", 5000, "����");
		jc.deleteJumun("3");
		jc.selectJumun("û����", 3000, "�ʷ�");
	}

}
