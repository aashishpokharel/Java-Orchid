package classwork;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try{
				int x[] = {1,2,3};
				System.out.println(x[10]);
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.print("hii");
				}finally {
					System.out.print("Nested");
				}
			int y = 5/0;
			System.out.println(y);
		}///if there is io exception we need to handle it seperately, Exception doesn't catch compiletime exception
		catch(ArithmeticException e){ 
			System.out.println("Exception Occured" + e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Error");
			
		}finally {
			System.out.println("Finally........");
			
		}
	}

}
