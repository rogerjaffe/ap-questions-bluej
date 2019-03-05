package q2014pr.q2;

public class Mountain
{
  /** @param array an array of positive integer values
   * @param stop the last index to check
   * Precondition: 0 <= stop < array.length
   * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
   * false otherwise
   */
  public static boolean isIncreasing(int[] array, int stop)
  {
    for (int i=1; i<=stop; i++) {
      if (array[i-1] >= array[i])
        return false;
    }
    return true;
  }

  /** @param array an array of positive integer values
   * @param start the first index to check
   * Precondition: 0 <= start < array.length - 1
   * @return true if for each j such that start <= j < array.length - 1,
   *         array[j] > array[j + 1];
   * false otherwise
   */
  public static boolean isDecreasing(int[] array, int start)
  {
    for (int i=start+1; i<array.length; i++) {
      if (array[i-1] <= array [i])
        return false;
    }
    return true;
  }

  /*************** Part a *****************/

  /** @param array an array of positive integer values
   * Precondition: array.length > 0
   * @return the index of the first peak (local maximum) in the array, if it exists;
   * -1 otherwise
   */
  public static int getPeakIndex(int[] array) {

  }

  /*************** Part b *****************/

  /** @param array an array of positive integer values
   * Precondition: array.length > 0
   * @return true if array contains values ordered as a mountain;
   * false otherwise
   */
  public static boolean isMountain(int[] array) {

  }

  /*********************** TESTING ****************************/

  public static void main(String[] args) {
    int[][] testArrayA = {
        {11, 22, 33, 22, 11},
        {11, 22, 11, 22, 11},
        {11, 22, 33, 55, 77},
        {99, 33, 55, 77, 120},
        {99, 33, 55, 77, 55},
        {33, 22, 11}
      };

    System.out.println("Part a");
    System.out.println(Mountain.getPeakIndex(testArrayA[0]));
    System.out.println(Mountain.getPeakIndex(testArrayA[1]));
    System.out.println(Mountain.getPeakIndex(testArrayA[2]));
    System.out.println(Mountain.getPeakIndex(testArrayA[3]));
    System.out.println(Mountain.getPeakIndex(testArrayA[4]));
    System.out.println(Mountain.getPeakIndex(testArrayA[5]));

    int[][] testArrayB = {
        {1, 2, 3, 2, 1},
        {1, 2, 1, 2, 1},
        {1, 2, 3, 1, 5},
        {1, 4, 2, 1, 0},
        {9, 3, 5, 7, 5},
        {3, 2, 1},
      };

    System.out.println("\nPart b");
    System.out.println(Mountain.isMountain(testArrayB[0]));
    System.out.println(Mountain.isMountain(testArrayB[1]));
    System.out.println(Mountain.isMountain(testArrayB[2]));
    System.out.println(Mountain.isMountain(testArrayB[3]));
    System.out.println(Mountain.isMountain(testArrayB[4]));
    System.out.println(Mountain.isMountain(testArrayB[5]));
  }
}