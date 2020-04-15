//Rolling Dice Assignment #2
// Author: Abhishek Deorukhkar, Email: abhi17@my.yorku.ca
// Student Number: 215539034
// 2 Players take turn rolling dice, where the sum of every roll is recorded
// First player to 75 wins!

import java.util.*;

public class Dice {

public static void main(String[] args)
{
	Random generator = new Random();
	
	int die_1;  // Integer value of the first dice
	int die_2;  // Integer value of the second dice
	int sum;    // Integer value of both dice combined
	int total1 = 0; // total number of wins for player 1 and they start with 0 wins
	int total2 = 0; // total number of wins for player 2 and they start with 0 wins
	
// using a do while loop allows the user to continue to play until the desired score is met, which is 75
	do
	{
//Player one attempt
		die_1 = generator.nextInt(6) + 1; // generates a number between 1-6 since a dice has 6 sides
		die_2 = generator.nextInt(6) + 1; // repeated for second dice

		sum = die_1 + die_2;

		if(die_1 == die_2) // if both dice roll the same value, then the user can roll again
		{
			total1 = total1 + sum;

			System.out.println("Player 1 rolled" + die_1 + " and a " + die_2);
			System.out.println("Player 1 total: " + total1);
			System.out.println("Player rolled a double, please roll again");

			die_1 = generator.nextInt(6) + 1;
			die_2 = generator.nextInt(6) + 1;

			sum = die_1 + die_2;
			total1 = total1 + sum; // adds to player 1's total

			System.out.println("Player 1 rolled a " + die_1 + " and a " + die_2);
			System.out.println("Player 1 total: " + total1);

		}


		else
		{

			total1 = total1 + sum;
			System.out.println("Player 1 rolled a " + die_1 + " and a " + die_2);
			System.out.println("Player 1 total: " + total1);
		}

// Player 2 attempt

		die_1 = generator.nextInt(6) + 1;
		die_2 = generator.nextInt(6) + 1;


		sum = die_1 + die_2;

		if(die_1 == die_2)
		{

		total2 = total2 + sum;

		System.out.println("Player 2 rolled" + die_1 + " and a " + die_2);
		System.out.println("Player 2 total: " + total2);
		System.out.println("Player rolled a double, please roll again");


		die_1 = generator.nextInt(6) + 1;
		die_2 = generator.nextInt(6) + 1;

		sum = die_1 + die_2;
		total2 = total2 + sum;

		System.out.println("Player 2 rolled a " + die_1 + " and a " + die_2);
		System.out.println("Player 2 total: " + total2);

		}

		else
		{

		total2 = total2 + sum;
		System.out.println("Player 2 rolled a " + die_1 + " and a " + die_2 );
		System.out.println("Player 2 total: " + total2);

		}
	}

	while (total1 < 75 && total2 < 75); // while loop used to count the number of wins and compare both players wins
	{
		if (total1 >= 75 && total2 < 75)
			{
				System.out.println("Player 1 has won the game!" + total1 + " wins!");
			}
			else if (total2 >= 75 && total1 < 75)
			{
				System.out.println("Player 2 has won the game!" + total2 + " wins!");
			}
			else if (total1 >= 75 && total2 >= 75)
			{
				if( total1 > total2)
					{
						System.out.println("Player 1 is the winner with " + total1 + " wins!");
					}
					else
					{
						System.out.println("Player 2 is the winner with " + total2 + " wins!");
					}
   }
  }
 }
}
























