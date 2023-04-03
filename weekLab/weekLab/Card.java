package weekLab;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Card {
   private String name;
   private int expirationYear;

   // constructor that sets up name as blank string if no name is given
   public Card() {
      name = "";
   }

   // constructor that sets up name as given name if name is given
   public Card(String n, int expirationYearParam) {
      name = n;
      expirationYear = expirationYearParam;
   }

   public String getName() {
      return name;
   }

   public int getExpirationYear() {
      return expirationYear;
   }

   public boolean isExpired(int currentYear) {
      GregorianCalendar calendar = new GregorianCalendar();
      int year = calendar.get(Calendar.YEAR);
      if (currentYear > year) {
         return true;
      } else {
         return false;
      }
   }

   public String format() {
      return "Card holder: " + name;
   }

   public String toString() {
      System.out.println("Card[name=" + this.getName() + ",expiration year=" + this.getExpirationYear() + "]");
      return "Card[name=" + this.getName() + ",expiration year=" + this.getExpirationYear() + "]";
   }

   public boolean equals(Card card2) {
      if(this.toString() == card2.toString()) {
         return true;
      } else {
         return false;
      }
   }
}