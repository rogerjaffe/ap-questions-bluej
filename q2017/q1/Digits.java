package q2017.q1;

import java.util.ArrayList;

/**
 * Write a description of class Digits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Digits
{
  /** The list of digits from the number used to construct this object.
   *  The digits appear in the list in the same order in which they appear in the original number.
   */
  private ArrayList<Integer> digitList;

  /**************** Part (a) ****************/

  /** Constructs a Digits object that represents num.
   *  Precondition: num >= 0
   */

  public Digits(int num)
  {

  }

  public String toString()
  {
    return digitList.toString();
  }

  /**************** Part (b) ****************/

  /** Returns true if the digits in this Digits object are in strictly increasing order;
   *  false otherwise.
   */
  public boolean isStrictlyIncreasing()
  {

  }

  public static void main(String[] args)
  {
    Digits d1 = new Digits(15704);
    System.out.println(d1);

    Digits d2 = new Digits(0);
    System.out.println(d2);

    System.out.println((new Digits(7)).isStrictlyIncreasing()); // true
    System.out.println((new Digits(1356)).isStrictlyIncreasing()); // true
    System.out.println((new Digits(1336)).isStrictlyIncreasing()); // false
    System.out.println((new Digits(1536)).isStrictlyIncreasing()); // false
    System.out.println((new Digits(65310)).isStrictlyIncreasing()); // false
  }
}
