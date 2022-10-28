package personnages;

public class Gaulois {
	private String  nom;
	private int effetPotion = 1 ;
	private int force, nb_trophees;
    private Equipement trophees[] = new Equipement[100];
    
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	public Gaulois( String nom, int force ) {
		this.nom= nom ;
		this.force= force ;}
	
	public String getNom() {
		return nom;}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+ texte + ">>");}
	
	//private String prendreParole() {
	//	return "le gaulois " + nom + " : ";}
	
	//public void frapper(Romain romain) {
	  //System.out.println(nom +"envoie un grand coup dans la machoire de "+ romain.getNom());
	  //romain.recevoirCoup(force/3);}
    
         

      private String prendreParole() {
          String texte = "Le gaulois " + nom + " : ";
          return texte;}
      
      public void frapper(Romain romain) {
    	  System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
    	  int x=((force / 3) * effetPotion);
    	  Equipement trophees[] = romain.recevoirCoup(x);
    	  for (int i = 0; trophees != null && i < trophees.length; i++,nb_trophees++) {
    	                 this.trophees[nb_trophees] = trophees[i]; }
    	  return; }
    	  }
     
	
