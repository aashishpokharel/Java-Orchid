package classwork;

public class StrCmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Aashish";
		String aa = "aashish";
		if(a.equals(aa)) {
			System.out.println("completely equal");
		}else {
			System.out.println("Not completely equal");
		}
		if(a.equalsIgnoreCase(aa)) {
			System.out.println("Equal not considering case");
		}else {
			System.out.println("Not even equal not considering case");
		}
	}

}
