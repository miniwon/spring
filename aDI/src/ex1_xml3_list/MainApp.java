package ex1_xml3_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// [1] ������ ���� ���� ����
			ApplicationContext context =
				new ClassPathXmlApplicationContext("ex1_xml3_list/applicationContext.xml");
		
		// [2] �� ��������
			ListBean bean = (ListBean)context.getBean("bean");
			for(Integer i : bean.getIntList()) {
				System.out.println(i);
			}
			
			for(MemberBean mb : bean.getMemberList()) {
				mb.output();
			}

	}

}
