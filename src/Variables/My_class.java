package Variables;

public class My_class {

	public static void main(String[] args) {
	
		//variables
		//1.variable declaration
		String name ; //non premitive data size not fixed in size and start with capital letter
		
		//variable initialization
		name = "anisha" ;
		
		//usage
		System.out.println("string value " +name);
		
		System.out.println("*****************");
		/*byte   1 byte - -128 to 127
		short  2 byte - -32,768 to 32,767
		int    4 byte - - 2,14,74,83,648 to 2,14,74,83,647
		long   8 byte - -92,23,37,20,36,85,47,75,808 to 92,23,37,20,36,85,47,75,807
		
		boolean 1 byte true or false
		char    2 byte characters
		float   4 byte Numerical and decimals
		double  8 byte Numerical and decimals */
		
		byte no;
		no = 127;
		System.out.println("Byte value " + no);
		
		System.out.println("*****************");
		
		short LastNo;
		LastNo = 32767;
		System.out.println("Short value " + LastNo);
		
		System.out.println("*****************");
		
		int RollNo;
		RollNo= 10;
		System.out.println("Int value " + RollNo);

		System.out.println("*****************");
		
		long LongNo;
		LongNo = 890273840 ;
		System.out.println("Long No " + LongNo);
		
		System.out.println("*****************");
	
		boolean truth;
		truth = true;
		System.out.println("boolean value " + truth );
		
		System.out.println("*****************");
		
		char div;
		div = 'a';
		System.out.println("Char value " + div);
		
		System.out.println("*****************");
		
		float numeric; //not accepting decimal value
		numeric = 893;
		System.out.println("floate value "+ numeric);
		
		System.out.println("*****************");
		
		double decimal;
		decimal =8908.364278;
		System.out.println("decimal value " +decimal );
		
		
		
		
		
	}

}
