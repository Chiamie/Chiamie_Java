public class CommissionEmployee extends Object {
	protected final String firstName;
	protected final String lastName;
	protected final String socialSecurityNumber;
	protected double commissionRate;
	protected double grossSalesAmount;
	
	private void validateGrossSalesAmount(){
		if(grossSalesAmount < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
	private void validateCommissionRate(){
		if(commissionRate <= 0.0 || commissionRate >= 1.0 )
			throw new IllegalArgumentException("Commission rate should be between 0.0 and 1.0");
	}
	
	public CommissionEmployee(String firstName, String lastName, 
	String socialSecurityNumber, double commissionRate, double grossSalesAmount){
		
		validateGrossSalesAmount();
		validateCommissionRate();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.commissionRate = commissionRate;
		this.grossSalesAmount = grossSalesAmount;
		
	}
	
	public String getFirstName() { return firstName; }
	
	public String getLastName() { return lastName; }
	
	public String getSocialSecurityNumber() { return socialSecurityNumber; }
	
	public double getCommissionRate() { return commissionRate; }
	
	public double getGrossSalesAmount() { return grossSalesAmount; }
	
	public void setCommissionRate(double commissionRate){
		validateCommissionRate();
		this.commissionRate = commissionRate;
	}
	
	public void setGrossSalesAmount(double grossSalesAmount){
		validateGrossSalesAmount();
		this.grossSalesAmount = grossSalesAmount;
	}

    public double earnings(){
        return commissionRate * grossSalesAmount;
    }
	
	@Override
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
		"commission employee", firstName, lastName,
		"social security number", socialSecurityNumber,
		"gross sales", grossSalesAmount,
		"commission rate", commissionRate);
		
	}
			
	
	
	
	




	
	
	

	
	
	





}