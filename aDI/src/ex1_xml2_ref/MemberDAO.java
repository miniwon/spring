package ex1_xml2_ref;

public class MemberDAO {
	
	private MemberBean member;
	
	public void isnert() {
	    member.output();
	    System.out.println("저장하였습니다");
	}
	   

	

	// constructor
	public MemberDAO() {}
	
	public MemberDAO(MemberBean member) {
		this.member = member;
	}




	// setter
	public void setMember(MemberBean member) {
		this.member = member;
	}
	
	
	

}
