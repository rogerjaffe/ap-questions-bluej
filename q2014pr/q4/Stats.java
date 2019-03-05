package q2014pr.q4;

import java.util.ArrayList;

public class Stats
{
  private ArrayList<ScoreInfo> scoreList;
  // listed in increasing score order; no two ScoreInfo objects contain the same score
  
  public Stats() {
    scoreList = new ArrayList<ScoreInfo>();
  }
  
  /** Records a score in the database, keeping the database in increasing score order. If no other
   * ScoreInfo object represents score, a new ScoreInfo object representing score
   * is added to the database; otherwise, the frequency in the ScoreInfo object representing
   * score is incremented.
   * @param score a score to be recorded in the list
   * @return true if a new ScoreInfo object representing score was added to the list;
   * false otherwise
   */
  public boolean record(int score) {

  }

  /** Records all scores in stuScores in the database, keeping the database in increasing score order
   * @param stuScores an array of student test scores
   */
  public void recordScores(int[] stuScores) {

  }
  
  /************************ TESTING ************************/
  
  public ArrayList<ScoreInfo> getScoreList() {
    return scoreList;
  }
  
  public static void main(String[] args) {
    Stats s = new Stats();
    System.out.println(s.record(10));
    System.out.println(s.record(10));
    System.out.println(s.record(20));
    for (ScoreInfo si : s.getScoreList()) 
      System.out.println(si.toString());
  }

}