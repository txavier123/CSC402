package algs11.hw5;

/**
 * A class to model prices.
 */
public class Price implements Comparable<Price> {
	private int dollars;
	private int cents;
	
	public Price(int dollars, int cents) {
		if (dollars < 0 || cents < 0 || cents > 99)
			throw new IllegalArgumentException();
		this.dollars = dollars;
		this.cents = cents;
	}
	
	public String toString() {
		String answer = "$" + dollars + ".";
		if (cents < 10)
			answer = answer + "0" + cents;
		else
			answer = answer + cents;
		return answer;
	}
	
	public int getDollars() {
        return dollars;
    }
    
    public int getCents() {
        return cents;
    }

	@Override
    public int compareTo(Price other) {
        // Compare dollars first
        if (this.dollars != other.dollars) {
            return Integer.compare(this.dollars, other.dollars);
        }
        // If dollars are equal, compare cents
        return Integer.compare(this.cents, other.cents);
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (cents != other.cents)
			return false;
		if (dollars != other.dollars)
			return false;
		return true;
	}

    public String getValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValue'");
    }
}
