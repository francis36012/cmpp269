package com.fagyapong.cmpp269.midtermpractices;

import java.util.*;

public class FlashCards {

	public static void main(String[] args) {

		int rounds = 0;
		int score = 0;
		double percentage = 0;

		int userAnswer, correctAnswer;
		int firstNumber, secondNumber;

		Random rgen = new Random();
		Scanner input = new Scanner(System.in);

		System.out.printf("Welcome to the multiplication flash cards\n\n");

		System.out.printf("How rounds do you want to play? ");
		rounds = input.nextInt();

		for (int i = 1; i <= rounds; i++) {
			firstNumber = rgen.nextInt(12) + 1;
			secondNumber = rgen.nextInt(12) + 1;

			correctAnswer = firstNumber * secondNumber;

			System.out.printf("What is %d x %d ? ", firstNumber, secondNumber);
			userAnswer = input.nextInt();

			if (userAnswer != correctAnswer) {
				System.out.printf("No, sorry that's wrong. Answer is %d\n",
						correctAnswer);
			} else {
				score += 1;
				System.out.printf("Nice work, that's correct...\n");
			}
		}
		percentage = (score / (double) rounds) * 100.0;

		System.out.printf("All done, your score was %d out of %d or %.2f%%\n",
				score, rounds, percentage);
		input.close();
	}
}