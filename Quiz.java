import java.util.Scanner;

public class Quiz { 
	private static int score;
	public static void main(String[] args) {

		System.out.println("Start Quiz!");
		System.out.println("-------------------");
		quiz1();
		quiz2();
		quiz3();
		quiz4();
		quiz5();
		result();
	} 
	private static void quiz1() {
		Scanner scn = new Scanner(System.in); 
		System.out.println("---------------------------------------------------");
		System.out.println("| What is a string instrument that has 6 strings? |");
		System.out.println("---------------------------------------------------");
		System.out.println("	[a] Flute           [b] Guitar ");
		System.out.println("	[c] Bass            [d] Violin ");
		System.out.print(" --: ");
		char ans = scn.nextLine().charAt(0);
		ans = Character.toLowerCase(ans);
		if (ans == 'b') {
			System.out.println("Your answer is Correct! ");
			score++;
		} else {
			System.out.println("The Correct Answer is [b]. Guitar!");
		}
	}
	private static void quiz2() {
		Scanner scn = new Scanner(System.in); 
		System.out.println("---------------------------------------------------");
		System.out.println("| What Band wrote Welcome to Black Parade?        |");
		System.out.println("---------------------------------------------------");
		System.out.println("	[a] My Chemical Romance [b] IVOS ");
		System.out.println("	[c] Air Supply          [d] Charlie Puth ");
		System.out.print(" --: ");
		char ans = scn.nextLine().charAt(0);
		ans = Character.toLowerCase(ans);
		if (ans == 'a') {
			System.out.println("Your answer is Correct! ");
			score++;
		} else {
			System.out.println("The Correct Answer is [a]. My Chemical Romance!");
		}
	}
	private static void quiz3() {
		Scanner scn = new Scanner(System.in); 
		System.out.println("---------------------------------------------------");
		System.out.println("| What is the Earth's natural satellite?          |");
		System.out.println("---------------------------------------------------");
		System.out.println("	[a] Moon            [b] Asteroid ");
		System.out.println("	[c] Mars            [d] None ");
		System.out.print(" --: ");
		char ans = scn.nextLine().charAt(0);
		ans = Character.toLowerCase(ans);
		if (ans == 'a') {
			System.out.println("Your answer is Correct! ");
			score++;
		} else {
			System.out.println("The Correct Answer is [a]. Moon!");
		}
	}
	private static void quiz4() {
		Scanner scn = new Scanner(System.in); 
		System.out.println("---------------------------------------------------");
		System.out.println("| What is a country with only one city?           |");
		System.out.println("---------------------------------------------------");
		System.out.println("	[a] China     	         [b] Philippines ");
		System.out.println("	[c] Singapore            [d] Japan ");
		System.out.print(" --: ");
		char ans = scn.nextLine().charAt(0);
		ans = Character.toLowerCase(ans);
		if (ans == 'c') {
			System.out.println("Your answer is Correct! ");
			score++;
		} else {
			System.out.println("The Correct Answer is [c]. Singapore!");
		}
	}
	private static void quiz5() {
		Scanner scn = new Scanner(System.in); 
		System.out.println("---------------------------------------------------");
		System.out.println("| What is the name of our planet?                 |");
		System.out.println("---------------------------------------------------");
		System.out.println("	[a] Moon            [b] Sun ");
		System.out.println("	[c] Mars            [d] Earth ");
		System.out.print(" --: ");
		char ans = scn.nextLine().charAt(0);
		ans = Character.toLowerCase(ans);
		if (ans == 'd') {
			System.out.println("Your answer is Correct! ");
			score++;
		} else {
			System.out.println("The Correct Answer is [d]. Earth!");
		}
	}

	private static void result() {
		int percentage = score * 100 / 5;
		System.out.println("You answered: " + score + " correctly out of 5 questions!");
		System.out.println("Your accuracy score is: " + percentage + "%");
	}
} 