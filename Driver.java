import java.util.Date;
public class Driver{

	public static void main(String[] args){


		System.out.println("Details of five cell user are");
		CellUser cellUser[] = new CellUser[5];

		CellUser prepaidUser1 = new PrepaidUser(200.1,120,12.5,"GONTSE","1741 PANKOP","2891 DIBATE","PO Box 2045","MR RANGWAKO","0616065321");
		CellUser contractUser1 = new ContractUser(new Date(),"Contract START BY MARCH","ANDROID SMART PHONE",200,120,"Itumeleng","H789 Morokweng","2891 Mafikeng","PO Box 8614","Dr Marks","0563986739"); 
		CellUser prepaidUser2 = new PrepaidUser(200.1,120,12.5,"Marks","H789 Morokweng","2891 Mafikeng","PO Box 8614","Dr Marks","0616065321");
		CellUser contractUser2 = new ContractUser(new Date(),"Contract end by the end of february 2019","manufactured in China",200,120,"MAPHELO","H789 Morokweng","2891 Mafikeng","PO Box 8614","Dr Marks","0563986739"); 
		CellUser prepaidUser3 = new PrepaidUser(200.1,120,12.5,"THABANG","H789 KLERKSDORP","2891 Mafikeng","PO Box 8614","Dr KOKETSO","0616065321");


		cellUser[0] = prepaidUser1;
		cellUser[1] = contractUser1;
		cellUser[2] = prepaidUser2;
		cellUser[3] = contractUser2;
		cellUser[4] = prepaidUser3;
		for(int i = 0; i<5;i++){
			System.out.println("Name : "+cellUser[i].getName() +" , "+"Cell Number :"+cellUser[i].getCellNumber());
		}
		
		System.out.println();
		System.out.println("Prepaid User details");
		PrepaidUser prepaidUser = new PrepaidUser(200.1,120,12.5,"SINO","H789 Morokweng","2891 Mafikeng","PO Box 8614","Dr Marks","0616065321");
		System.out.println(prepaidUser.toString());
		System.out.println();
		System.out.println("Contract User details");
		ContractUser contractUser = new ContractUser(new Date(),"Contract end by the end of february 2019","manufactured in China",200,120,"Itumeleng","H789 Morokweng","2891 Mafikeng","PO Box 8614","Dr Marks","0563986739");
		System.out.println(contractUser.toString());
	}
}