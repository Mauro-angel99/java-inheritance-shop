package generation.italy.shop;

public class Shop {
	
public static void main(String[] args) {
		
	Smarphone p1 = new Smarphone(2342342, "xperia", "sony", 499, 22, "IMEI 658785348", 128);
		
		System.out.println(p1);
		System.out.println("---------------------------------------");
		
	

    Televisori p2 = new Televisori(74836536, "Bravia", "sony", 899, 22, 60, 123, true);

    System.out.println(p2);
    System.out.println("---------------------------------------");


    Cuffie p3 = new Cuffie(67384763, "wf-c500", "sony", 49, 22, "blu", "wireless");

    System.out.println(p3);
    System.out.println("---------------------------------------");


}
}

