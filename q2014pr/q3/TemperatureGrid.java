package q2014pr.q3;

public class TemperatureGrid
{
  /** A two-dimensional array of temperature values, initialized in the constructor (not shown)
   * Guaranteed not to be null
   */
  private double[][] temps;
  /** Computes and returns a new temperature value for the given location.
   * @param row a valid row index in temps
   * @param col a valid column index in temps
   * @return the new temperature for temps[row][col]
   * - The new temperature for any element in the border of the array is the
   * same as the old temperature.
   * - Otherwise, the new temperature is the average of the four adjacent entries.
   * Postcondition: temps is unchanged.
   */

  public TemperatureGrid() {
    double [][] t = {
        {95.5, 100.0, 100.0, 100.0, 100.0, 110.3},
        {0.0, 50.0, 50.0, 50.0, 50.0, 0.0},
        {0.0, 40.0, 40.0, 40.0, 40.0, 0.0},
        {0.0, 20.0, 20.0, 20.0, 20.0, 0.0},
        {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}
      };
    temps = t;
  }

  /** Part a **/

  /** Computes and returns a new temperature value for the given location.
   * @param row a valid row index in temps
   * @param col a valid column index in temps
   * @return the new temperature for temps[row][col]
   * - The new temperature for any element in the border of the array is the
   * same as the old temperature.
   * - Otherwise, the new temperature is the average of the four adjacent entries.
   * Postcondition: temps is unchanged.
   */
  private double computeTemp(int row, int col) {

  }

  /** Part b **/

  /** Updates all values in temps and returns a boolean that indicates whether or not all the
   * new values were within tolerance of the original values.
   * @param tolerance a double value >= 0
   * @return true if all updated temperatures are within tolerance of the original values;
   * false otherwise.
   * Postcondition: Each value in temps has been updated with a new value based on the
   * corresponding call to computeTemp.
   */
  private boolean updateAllTemps(double tolerance) {

  }

  /********************* TESTING ************************/

  public String toString() {
    String buf = "";
    for (double[] row : temps) {
      for (double d : row) 
        buf += d + " ";
      buf += "\n";
    }
    return buf;
  }
  
  public static void main(String[] args) {
    System.out.println("Part a");
    TemperatureGrid t = new TemperatureGrid();
    System.out.println(t.computeTemp(2, 3));
    System.out.println(t.computeTemp(1, 1));
    System.out.println(t.computeTemp(0, 2));
    System.out.println(t.computeTemp(1, 3));
    
    System.out.println("\nPart b");
    System.out.println("Before");
    System.out.println(t.toString());
    System.out.println(t.updateAllTemps(0.01));
    System.out.println("\nAfter");
    System.out.println(t.toString());
    
  }
}