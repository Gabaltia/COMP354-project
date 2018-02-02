package src;

public class Cards {
	public enum CardType{
		DEBIT("debit"), CREDIT("credit");
		String cardtype;
		private CardType(String cardtype){
			this.cardtype = cardtype;
		}
		public String toString(){
			return this.cardtype;
		}
	}
	protected CardType type;
	protected int accNb;
	protected int cardNumber;
	protected double moneyAvailable;
	
	
	public Cards() {
		type=CardType.DEBIT;
		accNb = 0;
		cardNumber=0;
		moneyAvailable=0;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public int getAccNb() {
		return accNb;
	}

	public void setAccNb(int accNb) {
		this.accNb = accNb;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getMoneyCurrent() {
		return moneyAvailable;
	}

	public void setMoneyCurrent(double moneyAvailable) {
		this.moneyAvailable = moneyAvailable;
	}
}

