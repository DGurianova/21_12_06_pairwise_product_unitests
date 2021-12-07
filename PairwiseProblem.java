import com.sun.tools.corba.se.idl.InvalidArgument;

/**
 * The method must calculate the max pairwise product from the array with only non-negative numbers
 * <p>
 * the array to find the product from
 *
 * @return max pairwise product
 */
// TODO implement this, finding two max numbers (the numbers must be on the different indicies)
public class PairwiseProblem {
    public long solve(int[] array) {
        long result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                long multiplication = (long) array[i] * array[j];
                if (multiplication > result)
                    result = multiplication;
            }
        }
        return result;
    }

    public long solveTwo(int[] array) {
        if (array.length >= 2) {
            int indexMaxNumber = 0;
            int maxNumber = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxNumber) {
                    maxNumber = array[i];
                    indexMaxNumber = i;
                }
            }
            int maxNumbertwo = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxNumbertwo && i != indexMaxNumber) {
                    maxNumbertwo = array[i];
                }
            }
            return (long) maxNumber * maxNumbertwo;
        }
        throw new IllegalArgumentException("The argument is wrong, must be length 2 and more");

    }
}
