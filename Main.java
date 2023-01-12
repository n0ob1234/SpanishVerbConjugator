package SpanishPackage;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean going = true;
		while (going) {
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter the spanish verb.");
			String word = scan.nextLine();
			EndingChecker end = new EndingChecker(word);
			if (end.checkEnd()) {

				System.out.println("What do you want to conjugate to? 1 for subjective, 2 for preterite, 3 for future");
				int conNum = scan.nextInt();

				int situation = getTheSit();
				boolean ending = end.getEnding();

				switch (conNum) {
				case 1:
					Subjective sub = new Subjective(ending, situation, word);
					System.out.println(
							"The conjegated form of your word in the subjective form is " + sub.getFinalVerb());
					break;
				case 2:
					Preterite pret = new Preterite(ending, situation, word);
					System.out.println(
							"The conjegated form of your word in the subjective form is " + pret.getFinalVerb());
					break;
				case 3:
					Future fut = new Future(ending, situation, word);
					System.out.println(
							"The conjegated form of your word in the subjective form is " + fut.getFinalVerb());
					break;
				}

			} else {
				System.out.println("your word is not a spanish verb, or the verb does not end in ar, er, or ir.");
			}

			System.out.println("do you want to conjugate another verb.");
			String yorn = scan.nextLine();
			try {
			if(yorn.toLowerCase().equals("no")) {
				going = false;
				System.out.println("goodbye!");
			}
			else  if (yorn.toLowerCase().equals("yes")){
				going = true;
			}
			}
			catch(Exception e) {
				System.out.println("Sorry, you didn't input yes or no.");
				going = false;
			}
			
		}

	}

	public static int getTheSit() {
		Scanner scan = new Scanner(System.in);
		boolean going = true;
		while (true) {
			System.out.println("what is the situation? me, you, we, yall, he/she, they");
			String situation = scan.nextLine().toLowerCase();

			switch (situation) {
			case "me":
				
				return 0;

			case "you":
				
				return 1;

			case "we":
				return 2;

			case "yall":
				return 3;

			case "he/she":
				return 4;

			case "they":
				return 5;

			default:
				System.out.println(
						"Sorry, you must input exactly one of these situations.  me, you, we, yall, he/she, they");
				System.out.println("Try agian.");
			}
		}

	}
}
