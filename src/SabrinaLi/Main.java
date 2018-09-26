package SabrinaLi;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
		linear();
    }

	public static void linear() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Which game do you want to play, " + name + "? Linear or Binary?");
		String game = input.nextLine();
		if (game.toLowerCase().equals("linear")) {
			System.out.println("Pick a difficulty from 1 to 4, " + name + ".");
			int pick = input.nextInt();
			int x = (int)(Math.random() * Math.pow(10, pick));
			System.out.println("Guess the number between 1 and " + Math.pow(10, pick) + ", " + name + ".");
			int y = (int)(Math.pow(10, pick) + 1);
			while (y != x) {
				int num = input.nextInt();
				if (num != x) {
					System.out.println("Try again, " + name + ".");
				} else {
					System.out.println("Correct! Good job, " + name + "!");
					return;
				}
			}
		} else {
			if (game.toLowerCase().equals("binary")) {
				System.out.println("Pick a number between 1 and 100. I will guess your number.");
				int upper = 100;
				int lower = 0;
				int guess = (upper + lower) / 2;
				System.out.println("Is your number " + guess + "? (yes, higher, or lower)");
				while (upper != 101) {
					String reply = input.nextLine();
					if (reply.toLowerCase().equals("yes")) {
						System.out.println("Yay!");
						return;
					} else {
						if (reply.toLowerCase().equals("higher")) {
							lower = guess;
							guess = (guess + upper) / 2;
							System.out.println("Is your number " + guess + "? (yes, higher, or lower)");
						} else {
							if (reply.toLowerCase().equals("lower")) {
								upper = guess;
								guess = (guess + lower) / 2;
								System.out.println("Is your number " + guess + "? (yes, higher, or lower)");
							}
						}
					}
				}
			}
		}
	}
}
