////////////////////////////////////////////////////////////////////////////////
// Title:            PascalTriangle
// Files:            PascalTriangle.java
//
// Author:           Zhicheng Gu
// Email:            zhichenggu@cs.wisc.edu
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.util.Arrays;

/**
 * This class is used to print first five rows of Pascal's Triangle.
 * The output of this class(without bugs) should be:
 * 
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 * 
 * @author Zhicheng Gu
 *
 */
public class PascalTriangle {

	// The number of rows we want to print.
	private static final int MAX_LEVEL = 5;
	
	/**
	 * 
	 * Main class will first initialize and print 'nums' array, 
	 * which contains first row of Pascal's Triangle. 
	 * Then it will get and print numbers of next level iteratively.
	 * 
	 * @param args : not used.
	 */
	public static void main(String[] args) {
		// Array stores numbers on each level.
		// Numbers on tree levels are mapping to the smallest array indexes.
		// For example, for the first three rows, 
		// nums should be: [1, 0, 0, 0, 0], [1, 1, 0, 0, 0], [1, 2, 1, 0, 0].
		int[] nums = new int[MAX_LEVEL];	
		
		nums[0] = 1;
		
		// Get and print the numbers on each level.
		for (int level = 1; level <= MAX_LEVEL; level++) {
			if (level > 1) {
				nums = getNextLevel(nums, level);
			}
			
//			TODO: Part 1. Use print to help you debug.
//			This print statement helps determine whether the problem is in
//			getNextLevel or printOneLevel.			
//			System.out.println("Main method, nums: " + Arrays.toString(nums));			
			
			printOneLevel(nums, level);
		}
		
	}
	
	/**
	 * This method is used to print one level of Pascal's Triangle.
	 * 
	 * @param nums : Array stores numbers.
	 * @param level : The current level.
	 */
	private static void printOneLevel(int[] nums, int level) {
		// Print the spaces at the beginning of each line.
		for (int i = 0; i < MAX_LEVEL - level; i++) {
			System.out.print(' ');
		}
		
		for (int i = 0; i < level; i ++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * This method is used to calculate numbers on next level 
	 * based on current level.
	 * 
	 * @param nums : Array stores numbers.
	 * @param nextLevel : The number of next level.
	 */
	private static int[] getNextLevel(int[] nums, int nextLevel) {

		int[] nextNums = new int[MAX_LEVEL];  // Array stores numbers on next level.
		
		nextNums[0] = nums[0];
		
		// Each number at position i on the next level equals to the sum of
		// number at position i and i - 1 on the current level,
		// except the first one and the last one.
		for (int i = 1; i < nextLevel - 2; i++) {
			nextNums[i] = nums[i - 1] + nums[i];
		}
		
		nextNums[nextLevel - 1] = nums[nextLevel - 2];
		
//		TODO: Part 2. Use print to help you debug.
//		With the print statement in main we figured out the problem must be in this method.
//		This print statement is to see if this method is working correctly to this point.
//		System.out.println("getNextLevel method, nextNums: " + Arrays.toString(nextNums));		
		
		return nextNums;
	}

}
