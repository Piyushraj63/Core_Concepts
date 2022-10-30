package eat.dataInput;

import java.io.DataInputStream;
import java.io.IOException;


// Getting Input Using  DATAINPUTSTREAM
public class DIS {
  @SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException {
	  
	 DataInputStream dm=new DataInputStream(System.in);
	 String ename=dm.readLine();
	 System.out.println(ename);
	 int x=Integer.parseInt(dm.readLine());
	 System.out.println("Your Name is: " +x);
	 System.out.println(x+12);
	 float xx=Float.parseFloat(dm.readLine());
	 System.out.println("Your floatis: "+xx);
	 double xxx=Double.parseDouble(dm.readLine());
	 System.out.println("Your double is: "+xxx);
	
	 
  }
}
