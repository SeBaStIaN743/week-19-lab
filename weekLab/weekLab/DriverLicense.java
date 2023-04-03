package weekLab;

public class DriverLicense extends Card {

  public DriverLicense(String name, int expirationYearParam) {
    super(name, expirationYearParam);
  }

  @Override
  public String format() {
    return "Name: " + this.getName() + ", ExpirationYear: " + this.getExpirationYear();
  }

  @Override
  public String toString() {
    System.out.println("DriverLicense[name=" + this.getName() + "][expiration year=" + this.getExpirationYear() + "]");
    return "DriverLicense[name=" + this.getName() + "][expiration year=" + this.getExpirationYear() + "]";
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
