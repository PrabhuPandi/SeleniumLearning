package Java;

public class ExceptionCheck {

	public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		try{
			int a[] = new int[5];
			a[5]= 4/0;
		}
		
		catch(Exception e){
			System.out.println("Test");
		}
		ExceptionCheck m1= new ExceptionCheck();
		System.out.println(m1);
		//m1=null;
		System.out.println(m1);
		System.gc();
		System.out.println(m1);


	}

}
