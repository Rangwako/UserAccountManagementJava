public class PrepaidUser extends CellUser{
	private double dataBalance;
	private int minutesBalance;
	private double amountBalance;
	
	public PrepaidUser(){
	}
	public PrepaidUser(double dataBalance, int minutesBalance, double amountBalance, String name, String addressLine1, String addressLine2, String postalCode, String serviceProvider, String cellNumber){
		
		super(name, addressLine1, addressLine2, postalCode, serviceProvider, cellNumber);
		this.dataBalance = dataBalance;
		this.minutesBalance = minutesBalance;
		this.amountBalance = amountBalance;
	}
	public void setDataBalance(double dataBalance){
		this.dataBalance = dataBalance;
	}
	public double getDataBalance(){
		return dataBalance;
	}
	public void setMinutesBalance(int minutesBalance){
		this.minutesBalance = minutesBalance;
	}
	public int getMinutesBalance(){
		return minutesBalance;
	}
	public void setAmountBalance(double amountBalance){
		this.amountBalance = amountBalance;
	}
	public double getAmountBalance(){
		return amountBalance;
	}
	public String getShowAccount(){
		return "This is a prepaid user account";
	}
	@Override
	public String toString(){
		return "Name :"+name+" "+"CellNumber :"+cellNumber+" "+"AmountBalance :R"+amountBalance;
	}
}