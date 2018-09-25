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
		System.out.println("Pick a difficulty, " + name + ".");
		int pick = input.nextInt();
		int x = (int)(Math.random()* Math.pow(10,pick));
		System.out.println("Which game do you want to play, " + name + "?");
		//boop
		System.out.println("Guess the number, " + name + ".");
		System.out.println(x);
		int num = input.nextInt();
		if (num != x) {
			System.out.println("Try again, " + name + ".");
		} else {
			System.out.println("Correct! Good job, " + name + "!");
		}
	}
}
