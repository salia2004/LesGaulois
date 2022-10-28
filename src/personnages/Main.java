package personnages;


public class Main{
	public static void main(String[] args)
	{
	Gaulois asterix=new Gaulois("asterix",8);
	System.out.println(asterix);
	asterix.parler("bonjour a tous");
	Romain Minus=new Romain("Minus",6);
	Minus.parler("un gaulois est un petit");
	asterix.frapper(Minus);
	
	asterix.frapper(Minus);
	asterix.frapper(Minus);
	
//	Druide Panoramix=new Druide("Panoramix",5,10);
	
//	System.out.println(Equipement.CASQUE);
	
	
	}


}




