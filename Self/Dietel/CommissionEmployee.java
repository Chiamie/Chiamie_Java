public class CommissionEmployee extends Object {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double commissionRate;
	private double grossSalesAmount;
	
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
	
	public String getFirstName { return firstName; }
	
	public String getlastName { return lastName; }
	
	public String getsocialSecurityNumber { return socialSecurityNumber; }
	
	public double getcommissionRate { return commissionRate; }
	
	public double getgrossSalesAmount { return grossSalesAmount; }
	
	public void setcommissionRate(double commissionRate){
		validateCommissionRate();
		this.commissionRate = commissionRate;
	}
	
	public void setgrossSalesAmount(double grossSalesAmount){
		validateGrossSalesAmount();
		this.grossSalesAmount = grossSalesAmount;
	}
	
	@override
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
		"commission employee", firstName, lastName,
		"social security number", socialSecurityNumber,
		"gross sales", grossSales,
		"commission rate", commissionRate);
		
	}
			
	
	
	
	
	}



	
	
	

	
	
	





}