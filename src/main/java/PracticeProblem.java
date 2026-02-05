public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		String Line = s.nextLine();
		System.out.println(Line);
		s.close();

	}

	public static void q2() {
		//Write question 2 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		int number1 = s.nextInt();
		System.out.print("In: ");
		int number2 = s.nextInt();

		if(number2 !=0) {
		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
		}	 
		s.close();
	}


	public static void q3() {
		//Write question 3 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");


		String Apple = s.nextLine();
		System.out.println(Apple + " was the text you wrote");
		s.close();

	}

	public static void q4() {
		//Write question 4 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");

		int number3 = s.nextInt();
		System.out.println(number3 * 5);
		s.close();
	}

	public static void q5() {
		//Write question 5 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		boolean myboo = s.nextBoolean();
		System.out.println(myboo + "is a boolean");
		s.close();

	}

	public static void q6() {
		//Write question 6 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		double number4 = s.nextDouble();
		System.out.println(number4 - 3.2);
		s.close();
	}

}
