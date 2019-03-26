/*
Given an array, a summation number, and a maximum value; please give the total amount of
combinations, followed by the combinations themselves.
- The array should be of type [int].
- The summation represents how many numbers to add together. Taking the first example, this means
  that we need to find two elements in the array, when added together is less than or equal to the max.
  Looking at the second example, this means we need to find three elements in the array, when added
  together is less than or equal to the max.
- The max is the maximum value the addition of the summation is allowed to be to be considered
  a valid combination.


Examples
- Input
	- array = [5, 10, 3, -4]
	- summation = 2
	- max = 8
- Output
	- Total = 4
	- Combinations
		- [5, 3]
		- [5, -4]
		- [10, -4]
		- [3, -4]

- Input
	- array = [1, 1, 2, 2, 3, 4, 5]
	- summation = 3
	- max = 5
- Output
	- Total = 3
	- Combinations
		- [1, 1, 2]
		- [1, 1, 3]
		- [1, 2, 2]

To Compile in Java console:
type
javac Alfredo_Tigolo_Summation_Question.java

To Run in Java console:
type
java Alfredo_Tigolo_Summation
*/
class Alfredo_Tigolo_Summation
{
	public static void printArray ( int [] inArray )
	{
		for ( int i = 0; i < inArray.length; i++ )
		{
			System.out.println ( inArray [ i ]);
		}
		
	}
	public static void main (String[] args)
	{
		System.out.println("Hello Thomson Reuters");
		//- Input
		//- array = [5, 10, 3, -4]
		int[] anArray = {5, 10, 3, -4};
		//- summation = 2
		//- max = 8

		printArray ( anArray );
//<<<<<<< HEAD

		// Algorithm coded in C/C++ added
		/*
		int max_sum(int *vector, int len)
		{
			int best = 0, current = 0;
			int i = 0;
			for(i = 0; i < len; ++i)
			{
				current += *(vector + i);
				if(current < 0)
				{
					current = 0;
				}
				best = best > current ? best : current;
			}
			return best;
		}
		*/
		
//=======
//>>>>>>> parent of 6367ebc... c/c++ algorithm solution
	}
}