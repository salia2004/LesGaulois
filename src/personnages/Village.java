package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois=new Gaulois[nbVillageois];
	
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom=nom;
		villageois= new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
		
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef  " + this.chef.getNom() + " vivent les legendaires gaulois : ");
		for(int i=0; i<nbVillageois;i++) {
			System.out.println("- "+villageois[i].getNom());
		}}
	
	
	
	public static void main(String[] args) 
	{
		Village village=new Village("Village des irreductible",30);
		//Gaulois gaulois=village.trouverHabitant(30);// l'excetion est out of range
		Chef  Abraracourcix=new Chef("Abraracourcix",6,village);
		village.setChef(Abraracourcix);
		Gaulois asterix=new Gaulois("asterix",8);
		village.ajouterHabitant(asterix);
		///Gaulois gaulois=village.trouverHabitant(1); probleme de compilation 
		Gaulois obelix=new Gaulois("obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
	
}



	



