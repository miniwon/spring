package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	// 3. �ʵ��� ���������Թ��(DI)
	// *********************
	@Autowired
	private MemberBean member;
	
	public void isnert() {
	    member.output();
	    System.out.println("�����Ͽ����ϴ�");
	}
	   

	

	// constructor
//	public MemberDAO() {}
//	
//	public MemberDAO(MemberBean member) {
//		this.member = member;
//	}




	// setter
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
	
	
	

}
