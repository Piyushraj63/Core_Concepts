package eat.scanner;

import java.util.Scanner;
public class ScannerWAY {
  public static void main(String[] args) {
	 
	  Scanner sc=new Scanner(System.in);
	  char c=sc.next().charAt(0);
	  int in=sc.nextInt();
	  float fl=sc.nextFloat();
	  double d=sc.nextDouble();
	  String name=sc.next();
	  System.out.println(c+ " "+in+ " "+fl+" "+d+" "+name);
	  sc.close();
	 
  }
}
