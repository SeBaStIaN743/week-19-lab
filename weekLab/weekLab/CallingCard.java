package weekLab;

public class CallingCard extends Card {
  String cardNumber;
  int PIN;
  
  public CallingCard(String name, String CardNumberParam, int PINParam, int expirationYearParam) {
    super(name, expirationYearParam);
    cardNumber = CardNumberParam;
    PIN = PINParam;
  }

  @Override
  public String format() {
    return "Name: " + this.getName() + ", CardNumber: " + cardNumber + ", PIN: " + PIN + ", Expiration Year: " + this.getExpirationYear();
  }

  @Override
  public String toString() {
    System.out.println("CallingCard[name=" + this.getName() + "][number=" + this.cardNumber + ",pin=" + this.PIN + ",expiration year=" + this.getExpirationYear() + "]");
    return "CallingCard[name=" + this.getName() + "][number=" + this.cardNumber + ",pin=" + this.PIN + ",expiration year=" + this.getExpirationYear() + "]";
  }

  @Override
  public boolean equals(Card card2) {
    if(this.toString() == card2.toString()) {
       return true;
    } else {
       return false;
    }
 }
}
