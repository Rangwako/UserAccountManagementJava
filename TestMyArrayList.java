public class TestMyArrayList{
	public static void main(String[] args){
		
	MyArrayList<CellUser> list = new MyArrayList<>();

	ContractUser cu1 = new ContractUser("Wade van Niekerk","4 longroad", "Klerksdorp",2500,"Vodacom","08335423123","13/2/17", "Weekend plus100", "Nokia",64,2);
	ContractUser cu2 = new ContractUser("Godfrey Mokoena","4 longroad", "Klerksdorp",2500, "Vodacom","08335423123","13/2/17", "Weekend plus100", "Nokia", 15,2);  
	ContractUser cu3 = new ContractUser("Akani Simbine","23 Sprintlane", "Johannesburg",2000,"Cell-C", "0772361537","12/5/17", "Topup 500", "Samsung", 147,60);
	ContractUser cu4 = new ContractUser("Castor Semenya","23 Sprintlane", "Johannesburg",2000,"Cell-C", "0772361537","12/5/17", "Topup 500", "Samsung", 55,60);
	ContractUser cu5 = new ContractUser("Luvo Manyonga","23 Sprintlane", "Johannesburg",2000,"Cell-C", "0772361537","12/5/17", "Topup 500", "Samsung", 17,60);
	
	list.add(0,cu1);
	list.add(1,cu2);
	list.add(2,cu3);
	list.add(3,cu4);
	list.add(4,cu5);

	if (list.sortList())
    
	System.out.println(list);

	}

}