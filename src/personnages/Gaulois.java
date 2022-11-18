package personnages;
 
public class Gaulois {
	private String  nom;
	private int effetPotion = 1 ;
	private int force;
	private int nbTrophees=0 ;
    private Equipement[] trophees = new Equipement[100];
    
	//@Override
	//public String toString() {
		//return "Gaulois [nom=" + nom + ", force=" + force + "]";
	//}

	public Gaulois( String nom, int force ) {
		this.nom= nom ;
		this.force= force ;
		}
	public int getForce() {
		return force;
	}
	
	public String getNom() {
		return nom;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+ texte + ">>");
		}
	public String toString() {
        return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]";
        }
	//public void frapper(Romain romain) {
	  //System.out.println(nom +"envoie un grand coup dans la machoire de "+ romain.getNom());
	  //romain.recevoirCoup(force/3);}
    
     public void boirePotion(int force)
     {
    	 this.effetPotion=force;
    	 String p="Merci Druide, je sens que ma force est "+ this.effetPotion +" fois decuplee";
    	 this.parler(p);
     }

      //private String prendreParole() 
     // {
         // return  "Le gaulois " + nom + " : ";
      // }
     private String prendreParole() 
     {
         String texte = "Le gaulois " + nom + " : ";
         return texte;
     }
      
      public void frapper(Romain romain) {
    	  System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
    	  Equipement[] trophes = romain.recevoirCoup((force / 3) *effetPotion);
    	  for (int i = 0; trophes != null && i < trophes.length; i++,nbTrophees++) 
    	  {
    	                 this.trophees[nbTrophees] = trophes[i]; 
    	   }
      }
      public void faireUneDonnation(Musee musee) 
      {
    	  if (nbTrophees!=0) 
    	  {
    		  this.parler("je donne au musse all my trophees :");
    		  for (int i=0;i<nbTrophees;i++) {
    			  System.out.println("-" + trophees[i]);}
    	  }
    	  
      }
      
      
      
      
      
      
      
      

}