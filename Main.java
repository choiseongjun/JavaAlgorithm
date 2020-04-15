
public class Main {

	public static void main(String[] args) {
		Member member= new Member();
		member.setName("홍길동");
		member.setPassword("1234");
		member.setUserid("Test");
		
		System.out.println("이름="+member.getName());
		System.out.println("아이디="+member.getUserid());
		System.out.println("비밀번호="+member.getPassword());
	}
}
