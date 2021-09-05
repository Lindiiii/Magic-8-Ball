/** Program header: Magic8Ball.java
 * 
 * Author:    Lindi Mallory
 * Class:     21F Advanced Java (CS-2463-TW01F)
 * 
 * Brief Program Description: This program simulates a Magic 8 Ball. The user inputs
 * a yes or no question, an answer is randomly generated from the 15 elements in the ArrayList
 * using the getRandomElement method. Each question asked is then counted and printed once the
 * user enters an "empty" question.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
	public static void main(String args[]) 
	{
		// Create an empty array to hold the 8 balls answers
		ArrayList<String> answers = new ArrayList<String>();

		// 15 answers to an empty array
		answers.add("It is certian.");
		answers.add("Without a doubt.");
		answers.add("Yes definitely.");
		answers.add("You may rely on it.");
		answers.add("It is decidedly so.");
		answers.add("As I see it, yes.");
		answers.add("Reply hazy, try again.");
		answers.add("Ask again later.");
		answers.add("Better not tell you now.");
		answers.add("The answer you seek is not avaliable at the moment.");
		answers.add("Your aura is becoming more clear, try again.");
		answers.add("It is questionable.");
		answers.add("No.");
		answers.add("The answer you seek cannot be answered by me");
		answers.add("Bad fortunes look down upon you, no");

		// Create the scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Generating a Magic8Ball object
		Magic8Ball obj = new Magic8Ball();
		
		// Number of questions asked by the user
		int numberQuestionsAsked = 0;
		// While loop to ask the user multiple questions with a condition 
		while (true) 
		{
			// Prompt user for an input
			System.out.println("Enter your question here: ");
			// Store input from the user
			String questions = keyboard.nextLine();
			// Condition set to stop the while loop. Checks if the user inputs an "empty" question
			if (questions.isEmpty()) 
			{
				//print out number of questions asked
				System.out.println("Number of questions asked: " + numberQuestionsAsked);
				// Stops the while loop
				break;
			}
			else
			{
				// Prints out the random answer from the array list
				System.out.println(obj.getRandomElement(answers)+"\n");
				// Increments the number of questions asked by 1
				numberQuestionsAsked++;
			}
			keyboard.close();
		}
	}

	// Method to generate a random answer from the answers list, parameter is a String ArrayList
	public String getRandomElement(ArrayList<String> list) 
	{
		// Generate a new random object from the Random class
		Random rand = new Random();
		// This take a random index number from the array, and then returns it to the method being called
		return list.get(rand.nextInt(list.size()));
	}
}
