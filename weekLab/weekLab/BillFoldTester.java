package weekLab;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BillFoldTester {
  public static void main(String[] args) {
    // get current year
    GregorianCalendar calendar = new GregorianCalendar();
    int year = calendar.get(Calendar.YEAR);

    // define new objects
    CallingCard card1 = new CallingCard("John Doe", "081343259908,", 4145, year + 2);
    DriverLicense card2 = new DriverLicense("John Doe", year - 2);
    BillFold testingBillFold = new BillFold(card1, card2);

    System.out.println("Expected Output: 1");
    System.out.println("Given Output: " + testingBillFold.getExpiredCardCount());
  }
}
