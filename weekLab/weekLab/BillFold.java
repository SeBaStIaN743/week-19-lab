package weekLab;

public class BillFold {
  Card card1;
  Card card2;

  public BillFold(Card card1Param, Card card2Param) {
    card1 = card1Param;
    card2 = card2Param;
  }

  public void addCard(Card newCard) {
    if (card1 == null) {
      card1 = newCard;
    } else if (card2 == null) {
      card2 = newCard;
    }
  }

  public String formatCards() {
    return "[" + card1.format() + "|" + card2.format() + "]";
  }

  public int getExpiredCardCount() {
    int numberOfExpiredCards = 0;

    if(!card1.isExpired(card1.getExpirationYear())) {
      numberOfExpiredCards += 1;
    }

    if(!card2.isExpired(card2.getExpirationYear())) {
      numberOfExpiredCards += 1;
    }

    return numberOfExpiredCards;
  }
}
