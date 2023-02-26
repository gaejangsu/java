class A0210 {

	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("input number : ");
		String input = scanner.nextLine();
		scanner.close();
		int number = Integer.parseInt(input);
		
		System.out.println("inputed : " + input);
		System.out.printf("number : %d%n", number);
		
	}

}