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
		parler("Bonjour,je sis le druide"+ nom + "et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax +".");
		}
	
	public String getNom() {
		return nom;}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "<<" + texte + "");
	}
	
	private String prendreParole() {
		return "le druide"+ nom + ":";
	}

	public void preparerPotion(int effetPotionMax) {
        Random random = new Random();
        this.forcePotion = random.nextInt(effetPotionMax - this.effetPotionMin) + this.effetPotionMin;
        if (forcePotion > 7) {
                this.parler("J'ai préparé une super potion de force : " + this.forcePotion);
         }
        else {
                this.parler("Je n'ai pas trouvé tous les ingrédients, "
                               +" ma potion est seulement de force : " + this.forcePotion);
         }
		}
	public void booster(Gaulois gaulois){
        if (gaulois.getNom() == "Obélix"){
                this.parler("Non, Obélix !... Tu n'auras pas de potion magique !"
                               +" (Tu es tombé dedans étant petit)");
                gaulois.parler("Par Bélénos, ce n'est pas juste !");
         }
        else {
                gaulois.boirePotion(this.forcePotion);
         }
 }
		
	}



