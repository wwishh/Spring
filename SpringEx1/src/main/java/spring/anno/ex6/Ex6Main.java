package spring.anno.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new ClassPathXmlApplicationContext("annoContext4.xml");
		
		MysqlController mc = app.getBean("mc", MysqlController.class);
		mc.insert("ȫ����");
		mc.delete("3");
		mc.select("���ֿ�");
	}

}
