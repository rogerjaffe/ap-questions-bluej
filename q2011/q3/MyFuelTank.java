package q2011.q3;

public class MyFuelTank implements FuelTank
{
  private int level;
  
  public MyFuelTank(int level) { this.level = level; }  
  public int getFuelLevel() { return level; }
}
