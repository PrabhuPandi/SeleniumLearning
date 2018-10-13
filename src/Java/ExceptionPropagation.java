package Java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionPropagation {
	  void m() throws IOException,SQLException,ArithmeticException,NullPointerException,RuntimeException,ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException,NumberFormatException,SQLException,IOException,FileNotFoundException{
		    int data=50/0;
		    throw new java.io.IOException("device error");//checked exception  
		  }
		  void n(){
		 try{
			 m();
		 }catch(Exception e){
			 System.out.println("S");
		 }
		  }
		  void p(){
		   try{
		    n();
		   }catch(Exception e){System.out.println("exception handled");}
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionPropagation obj= new ExceptionPropagation();
		obj.p();
	}

}
