package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// [1] ������ ���� ���� ����
			ApplicationContext context =
				new ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
		// [2] �� ��������
			MemberBean bean = context.getBean("member", MemberBean.class);
			bean.output();
			
			MemberBean bean2 = context.getBean("member2", MemberBean.class);
			bean2.output();
		
			MemberDAO dao1 = context.getBean("dao", MemberDAO.class);
			dao1.isnert();
			
			MemberDAO dao2 = context.getBean("dao2", MemberDAO.class);
			dao2.isnert();
	}

}
