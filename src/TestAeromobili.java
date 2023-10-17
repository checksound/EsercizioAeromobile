
public class TestAeromobili {
	
	private static boolean isSuperior(Aeromobile a1, Aeromobile a2) {
		return a1.superiore(a2);
	}
	
	public static void main(String[] args) {
		
		Aeromobile aer1 = new Aliante("aliante_1", 5);
		Aeromobile aer2 = new Aliante("alainte_2", 6);
		
		Aeromobile al1 = new AereoMotore("aeromobile_1", 15); 
		Aeromobile al2 = new AereoMotore("aeromobile_2", 25);
		
		if(isSuperior(aer1, aer2))
			System.out.println(aer1 + " - IS SUPERIOR - " + aer2);
		else 
			System.out.println(aer1 + " - IS NOT SUPERIOR - " + aer2);
		
		if(!isSuperior(al1, al2))
			System.out.println(al1 + " - IS NOT SUPERIOR - " + al2);
		else
			System.out.println(al1 + " - IS SUPERIOR - " + al2);
		
		if(isSuperior(al1, aer1))
			System.out.println(al1 + " - IS SUPERIOR - " + aer1);
		else 
			System.out.println(al1 + " - IS NOT SUPERIOR - " + aer1);
		
		
		
		
		
		
		
		

	}

}
