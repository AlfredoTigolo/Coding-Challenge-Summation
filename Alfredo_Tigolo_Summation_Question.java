import java.util.Arrays;

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

	/**
	 * used to simply print elements
	 */
	private static final String HELLO_THOMSON_REUTERS = "Hello Thomson Reuters \n Alfredo.Tigolo@yahoo.com \n 424-646-3493 \n ";

	/*
	 * Function that takes an array and prints the contents of the array
	 */
	public static void printArray(int[] inArray) {

		System.out.print("Input [ ");
		for (int i = 0; i < inArray.length; i++) {
			if (inArray.length - 1 == i)
				System.out.print(inArray[i] + " ");
			else
				System.out.print(inArray[i] + ", ");
		}
		System.out.print("]");

	}

	/*
	* Sum program that looks for max, len, and array as inputs
	*/
	public static void sumArray(int[] inArray, int len, int max) {
		System.out.println();
		int best = 0, current = 0, sum = 0;
		int i = 0, j = max - 1;
		
		//while ( j <= max - 1 )
		while ( j >= 0 )
		{
			for (i = 0; i < len; ++i) {
				// current += *(vector + i);
				//current += inArray[i]; // returns the max
				try
				{
					//current += inArray[i] + inArray[j]; // sums elemnts i and j
					if ( len == 3 )
						//current = inArray[i] + inArray[j] + inArray[j+1]; // sums elemnts i and j
						sum = inArray[i] + inArray[j] + inArray[j+1]; // sums elemnts i and j
					else
					{
						//current = inArray[i] + inArray[j]; // sums elemnts i and j
						sum = inArray[i] + inArray[j]; // sums elemnts i and j
						System.out.println ( i + " i = " + inArray[i] );
						System.out.println ( j + " j = " + inArray[j] );
					}

				}
				catch ( ArrayIndexOutOfBoundsException e )
				{				
				}

				//System.out.println("Current = " + current);
				//System.out.println("Current = " + sum);
				// if(current < 0)
				//if (current < max) {
				if (sum < max) {
					//current = 0;
					sum = 0;
				}
				//best = best > current ? best : current;
				max = best > max ? best : max;				
			}
			if ( sum < max )
			{
				System.out.println("max = " + max);
				System.out.println("best = " + best);
				System.out.println("sum = " + sum);
				System.out.println("summation = " + len); //number of array elements
			}
			

			j--;
		}

	}

	public static void main(String[] args)
		throws ArrayIndexOutOfBoundsException {
		System.out.println(HELLO_THOMSON_REUTERS);
		//- Input
		//- array = [5, 10, 3, -4]
		int[] anArray1 = {5, 10, 3, -4};
		int[] anArray2 = {1, 1, 2, 2, 3, 4, 5};
		//- summation = 2
		//- max = 8

		
			//printArray ( anArray1 );
			System.out.println( Arrays.toString( anArray1 ) );
			sumArray ( anArray1, 2, 8 );

			System.out.println();

			//printArray ( anArray2 );
			System.out.println( Arrays.toString( anArray2 ) );
			sumArray ( anArray2, 3, 5 );
		
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