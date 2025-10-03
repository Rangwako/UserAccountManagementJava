public abstract class CellUser{
	protected String name;
	private String addressLine1;
	private String addressLine2;
	private String postalCode;
	private String serviceProvider;
	protected String cellNumber;

	protected CellUser(){
		this("Lerato","D231 klerksdorp","H341 Gamorakile","Po Box 534","Dr kankuzi","0562524546");
	}
	protected CellUser(String name, String addressLine1, String addressLine2, String postalCode, String serviceProvider, String cellNumber){
		
	this.name = name;
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	this.postalCode = postalCode;
	this.serviceProvider = serviceProvider;
	this.cellNumber = cellNumber;	
	}
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;
	}
	public void setAddressLine1(String addressLine1){
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine1(){
		return addressLine1;
	}
	public void setAddressLine2(String addressLine2){
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine2(){
		return addressLine2;
	}
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	public String getPostalCode(){
		return postalCode;
	}
	public void setServiceProvider(String serviceProvider){
		this.serviceProvider = serviceProvider;
	}
	public String getServiceProvider(){
		return serviceProvider;
	}
	public void setCellNumber(String cellNumber){
		this.cellNumber = cellNumber;
	}
	public String getCellNumber(){
		return cellNumber;
	}
	public abstract String getShowAccount();
	@Override
	public String toString(){
		return "Name:"+name + "," + "CellNumber: "+cellNumber;
	}
}