import java.util.Scanner;

public class jcamacho4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose an option: ");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");

		int userInput = scanner.nextInt();

		switch(userInput)
		{
			case 1:
				System.out.println("It is what it is.");
				break;
			case 2:
				System.out.println("You got this. ");
				break;
			case 3:
				System.out.println("Keep it pushing. ");
				break;
			case 4:
				System.out.println("You are in control of your own fate. ");
				break;
			}
			scanner.close();
	}
}


