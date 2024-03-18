package kasus1;

public class Commission extends Hourly {
	/**
	 * The total sales the employee has made
	 */
	private double totalSales;
	
	/**
	 * The commission rate for the employee
	 */
	private double commissionRate;
	
	// The constructor takes 6 parameters:  the first 5 are the same as for Hourly & the 6th is the commission rate
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
	                  double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
	}
	
	/**
	 * One additional method is needed: public void addSales (double totalSales) that adds the parameter to the instance
	 * variable representing total sales.
	 */
	public void addSales(double totalSales){
		this.totalSales = totalSales;
	}
	
	@Override
	public double pay() {
		// The pay method must call the pay method of the parent class to compute the pay for hours worked then add to that the
		// pay from commission on sales.
		double payment = super.pay() + (this.commissionRate * this.totalSales);
		this.totalSales = 0; // The total sales should be set back to 0
		return payment;
	}
	
	/**
	 * The toString method needs to call the toString method of the parent class then add the total sales to that.
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + this.totalSales;
		return result;
	}
	
	public double getTotalSales() {
		return totalSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
}
