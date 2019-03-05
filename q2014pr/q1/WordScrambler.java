package q2014pr.q1;

import java.lang.reflect.Array;

public class WordScrambler
{
  private String[] scrambledWords;
  /** @param wordArr an array of String objects
   * Precondition: wordArr.length is even
   */
  public WordScrambler(String[] wordArr)
  {
    scrambledWords = mixedWords(wordArr);
  }

  /**  Part a  **/

  /** @param word1 a String of characters
   * @param word2 a String of characters
   * @return a String that contains the first half of word1 and the second half of word2
   */
  private String recombine(String word1, String word2)
  {

  }

  /** Part b **/
  
  /** @param words an array of String objects
   * Precondition: words.length is even
   * @return an array of String objects created by recombining pairs of strings in array words
   * Postcondition: the length of the returned array is words.length
   */
  private String[] mixedWords(String[] words)
  {

  }
  
  /*********************** TESTING ************************/
  
  public String _recombine(String word1, String word2) {
    return recombine(word1, word2);
  }
  
  public String toString() {
    String buf = "";
    for (String s : scrambledWords) {
      buf += s + " ";
    }
    return buf;
  }
  
  public static void main(String[] args) {

    String[] words = {"apple","pear","this","cat"};
    WordScrambler w = new WordScrambler(words);
    // Part a test
    System.out.println(w._recombine("apple", "pear"));
    System.out.println(w._recombine("pear", "apple"));
    
    // Part b test
    System.out.println(w.toString());
  }

}