


import java.util.Scanner;

//App for printing out the useful information about java integer primitives 
public class HW_2_Class1 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner (System.in); //input data from the console
		while(true) {
			System.out.println("enter integer primitive type (int, byte, short, long, char) or exit");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				break;
			
		}
			printInformationByType(line);
//			System.out.println(line + " from application");
		}
		
		System.out.println("thanks for using our application & bye");
	}

	private static void printInformationByType(String type) {
		// your homework should contain switch by the given type (long, int, short, byte, char)
		// for default there should be out: Wrong primitive type
		// for each type there should be an appropriate method of printing information of the type 
		// for example, print\char\\information - method printing out the info about type "char"
		
		switch (type) {
		case "long": 
			isLong();
			break;
		
		case "int": 
			isInt();
			break;
			
		case "short": 
			isShort();
			break;
			
		case "byte": 
			isByte();
			break;
		
		case "char": 
			isChar();
			break;
		
		default:
			System.out.println("Typing error because you need to enter integer primitive type (int, byte, short, long, char) or exit");
			
			
		}

	}

	private static void isByte() {
		// TODO Auto-generated method stub
		byte minValue = 1;
  		byte maxValue = 1;
  		int nBits = 1;
  		while(minValue > 0) {
  			minValue = (byte) (minValue * 2); // compiler casts minValue to int, multiplies on 2 
  			nBits = nBits + 1;
  		}
  		maxValue = (byte) (minValue - 1);
  		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);
		
	}

	private static void isChar() {
		// TODO Auto-generated method stub
		char minValue = 1;
  		char maxValue = 1;
  		int nBits = 0;
  		while(minValue > 0) {
  			minValue = (char) (minValue * 2); // compiler casts minValue to int, multiplies on 2 
  			nBits = nBits + 1;
  		}
  		maxValue = (char) (minValue - 1);
  		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);
		
	}

	private static void isShort() {
		// TODO Auto-generated method stub
		short minValue = 1;
  		short maxValue = 1;
  		int nBits = 1; 
  		while(minValue > 0) {
  			minValue = (short) (minValue * 2); // compiler casts minValue to int, multiplies on 2 
  			nBits = nBits + 1;
  		}
  		maxValue = (short) (minValue - 1);
  		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);
		
	}

	private static void isInt() {
		// TODO Auto-generated method stub
		int minValueInt = 1;
		int maxValueInt = 1;
		int nBitsInt = 1;
		while(minValueInt > 0) {
			minValueInt =  (minValueInt * 2); // compiler casts minValue to int, multiplies on 2 
			nBitsInt = nBitsInt + 1;
		}
		maxValueInt = (minValueInt - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", minValueInt, maxValueInt, nBitsInt / 8);
		
	}

	private static void isLong() {
		// TODO Auto-generated method stub
		long minValue = 1;
		long maxValue = 1;
		int nBits = 1;
		while(minValue > 0) {
			minValue =  (minValue * 2); // compiler casts minValue to int, multiplies on 2 
			nBits = nBits + 1;
		}
		maxValue = (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", minValue, maxValue, nBits / 8);
	}
}