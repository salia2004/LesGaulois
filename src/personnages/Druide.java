package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	
	public Druide(String nom,int effetPotionMin,int effetPotionMax) {
		this.nom=nom;
		this.effetPotionMax=effetPotionMax;
		this.effetPotionMin=effetPotionMin;
		parler("Bonjour,je sis le druide"+ nom + "et ma potion peut aller d'une force" + effetPotionMin + "a" + effetPotionMax +".");
		}
	
	public String getNom() {
		return nom;}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "<<" + texte + "");
	}
	
	private String prendreParole() {
		return "le druide"+ nom + ":";
	}

	public void preparerPotion() {
		
		Random random = new Random();
		forcePotion=random.nextInt(effetPotionMax);
		if (forcePotion>7) {
			parler("j'ai prepare une super potion de force");
		}else {
			parler("je n'ai pas trouvw tous les ingredients ,ma potion est seulement de force");
		}
		}
		
	}



