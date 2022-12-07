package tpackage;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicOne pu = new PublicOne();
		PrivateOne pr = new PrivateOne();
		ProtectedOne pro = new ProtectedOne();
		pu.name();
//		pr.name();
		pr.name2();
		pro.name();
		pro.name2();
	}
}

class PublicOne{
	public String aashish = "aashish";
	public String pokharel= "pokharel";
	public String nickname = "DON";
	
	public void name() {
		System.out.println("PUBLIC");
		System.out.println(aashish + pokharel + nickname);
	}
}

class PrivateOne{
	private String aashish = "aashish";
	private String pokharel= "pokharel";
	private String nickname = "DON";
	
	private void name() {
		System.out.println("PRIVATE");
		System.out.println(aashish + pokharel + nickname);
	}
	public void name2() {
		name();
	}
}

class ProtectedOne{
	protected String aashish = "aashish";
	protected String pokharel= "pokharel";
	protected String nickname = "DON";
	
	protected void name() {
		System.out.println("PROTECTED");
		System.out.println(aashish + pokharel + nickname);
	}
	public void name2() {
		name();
	}
}

