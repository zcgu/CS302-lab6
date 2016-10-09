public class Quilt {

    public static void main(String[] args) {

        /*TODO: Task 1 */
        char [][] myBlock = { {'x', '.', '.', '.', '.'},
        						{'x', '+', '.', '.', '.'},
        						{'x', '+', '+', '.', '.'},
        						{'x', 'x', 'x', 'x', 'x'} };
        
        char [][] myQuilt; 
        
        displayPattern(myBlock);

    }

    public static void displayPattern(char[][] myArray) {
        /*TODO Task 2 */
    	
    	for (int i = 0; i < myArray.length; i++) {
    		for (int j = 0; j < myArray[0].length; j++) {
    			System.out.print(myArray[i][j]);
    		}
    		System.out.println();
    	}
    	
    	
    }  

    public static void createQuilt(char[][] quilt, char[][] block) {
        /*TODO Tasks 4, 5, and 6 */
    }

    /**
     * Places the 2-D character array block into the 2-D character array quilt
     * starting with the upper left hand corner of the block placed into 
     * position in the quilt at startRow, startCol
     *
     * Note: This is implemented for you, DO NOT CHANGE THIS METHOD.
     */
    public static void placeBlock(char[][] quilt, char[][] block,
            int startRow, int startCol){
        for (int r = 0; r < block.length; r++) {
            for (int c = 0; c < block[r].length; c++) {
                quilt[r+startRow][c+startCol] = block[r][c];
            }
        }
    }

    /**
     * Returns a 2-D array which is the horizontally flipped version
     * of the block parameter.
     */
    public static char[][] createFlipped(char[][] block) {
        /*TODO Task 5 */
        return null; // this is here only so that this method compiles
        // replace it when you do Task 5
    }
}
