package weekLab;

public class IDCard extends Card {
  int IDNumber;

  public IDCard(String name, int IDNumberParam, int expirationYearParam) {
    super(name, expirationYearParam);
    IDNumber = IDNumberParam;
  }

  @Override
  public String format() {
    return "Name: " + this.getName() + ", ID: " + IDNumber + ", Expiration Year: " + this.getExpirationYear();
  }

  @Override
  public String toString() {
    System.out.println("IDCard[name=" + this.getName() + "][ID=" + this.IDNumber + ",expiration year=" + this.getExpirationYear() + "]");
    return "IDCard[name=" + this.getName() + "][ID=" + this.IDNumber + ",expiration year=" + this.getExpirationYear() + "]";
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
