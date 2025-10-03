import java.util.Date;
public class ContractUser extends CellUser{
	private Date dateStart;
	private String contractDescription;
	private String phoneDescription;
	private int minutesLeft;
	private int smsLeft;
	
	public ContractUser(){
	}
	/**public ContractUser(Date dateStart, String contractDescription, String phoneDescription, int minutesLeft, int smsLeft){
		this.dateStart = dateStart;
		this.contractDescription = contractDescription;
		this.phoneDescription = phoneDescription;
		this.minutesLeft = minutesLeft;
		this.smsLeft = smsLeft;

	}*/
	public ContractUser(Date dateStart, String contractDescription, String phoneDescription, int minutesLeft, int smsLeft, String name, String addressLine1, String addressLine2, String postalCode, String serviceProvider, String cellNumber){
		super(name, addressLine1, addressLine2, postalCode, serviceProvider, cellNumber);
		this.dateStart = dateStart;
		this.contractDescription = contractDescription;
		this.phoneDescription = phoneDescription;
		this.minutesLeft = minutesLeft;
		this.smsLeft = smsLeft;
		//setName(name);
		//setAddressLine1(addressLine1);
		//setAddressLine2(addressLine2);
		//setPostalCode(postalCode);
		//setServiceProvider(serviceProvider);
		//setCellNumber(cellNumber);

	}
	public void setDateStart(Date dateStart){
		this.dateStart = dateStart;
	}
	public Date getDateStart(){
		return dateStart;
	}
	public void setContractDescription(String contractDescription){
		this.contractDescription = contractDescription;
	}
	public String getContractDescription(){
		return contractDescription;
	}
	public void setPhoneDescription(String phoneDescription){
		this.phoneDescription = phoneDescription;
	}
	public String getPhoneDescription(){
		return phoneDescription;
	}
	public void setMinutesLeft(int minutesLeft){
		this.minutesLeft = minutesLeft;
	}
	public int getMinutesLeft(){
		return minutesLeft;
	}
	public void setSmsLeft(int smsLeft){
		this.smsLeft = smsLeft;
	}
	public int getSmsLeft(){
		return smsLeft;
	}
	public String getShowAccount(){
		return "This is a ContractUser Account";
	}
	@Override
	public String toString(){
		return "Name :"+name+" "+"CellNumber :"+cellNumber+" "+"PhoneDescription :"+phoneDescription;
	}
}	 