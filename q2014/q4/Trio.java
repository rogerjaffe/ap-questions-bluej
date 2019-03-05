package q2014.q4;

import java.text.DecimalFormat;

public class Trio implements MenuItem
{
  private Sandwich sandwich;
  private Salad salad;
  private Drink drink;
  
  public Trio(Sandwich aSandwich, Salad aSalad, Drink aDrink)
  {

  }
  
  public String getName()
  {
    return sandwich.getName() + "/" + salad.getName() +
                                "/" + drink.getName() + " Trio";
  }
  
  public double getPrice()
  {
    double price1 = sandwich.getPrice();
    double price2 = salad.getPrice();
    double price3 = drink.getPrice();
    double smallest = Math.min(Math.min(price1, price2), price3);
    return price1 + price2 + price3 - smallest;
  }

  public String toString ()
  {
    DecimalFormat money = new DecimalFormat("0.00");
    return getName() + " " + money.format(getPrice());
  }  
  
  public static void main(String[] args) {
    Sandwich sandwich = new Sandwich("BLT", 8.99);
    Salad salad = new Salad("Cobb", 6.99);
    Drink drink = new Drink("Dr. Pepper", 2.79);
    Trio trio = new Trio(sandwich, salad, drink);
    System.out.println("Sandwich: "+sandwich.getName()+" "+sandwich.getPrice());
    System.out.println("Salad: "+salad.getName()+" "+salad.getPrice());
    System.out.println("Drink: "+drink.getName()+" "+drink.getPrice());
    System.out.println("The next line should read: ");
    System.out.println("Trio: BLT/Cobb/Dr. Pepper Trio 15.98");
    System.out.println("....................................");
    System.out.println("Trio: "+trio.toString());
  }
}
