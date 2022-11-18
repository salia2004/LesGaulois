package personnages;
 

public class Romain {
	private String nom;
	private int force;
	private Equipement[]equipements= new Equipement[2];
	private int nbEquipement=0;
	
	public Romain(String nom, int force ) {
		this.nom=nom;
		this.force=force;
		if (force<=0) 
		{	
			throw new IllegalArgumentException("Invalid force " + force);
		}
		
		}
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+ texte +">>");
	}
	
	private String prendreParole() {
		return "le romain " + nom + " : ";
	}
	/*public void recevoirCoupP(int forceCoup) {
		if (forceCoup>0) {
			parler("Aie");
			force-=forceCoup;
		}else {
			parler("j'abandone");
		}}*/
	
	public void sEquiper(Equipement equipement) 
	{
		switch(nbEquipement) 
		{
		case 2:
			{
				System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			}
			break;
		case 1:
		{
			
			if (equipements[0]==equipement)
			{
				System.out.println("Le soldat " + nom + " possede deja un " + equipement.toString());
				break;
			}
		}
		default:
		{
			System.out.println("Le soldat " + nom + " s'equipe avec un  " +  equipement.toString() );
			equipements[nbEquipement]=equipement;
			nbEquipement++;
		}
		}
		
		
	}
	public Equipement[] recevoirCoup(int forceCoup) {
        Equipement[] equipementEjecte = null;
        // précondition
        assert force > 0;
        int oldForce = force;
        forceCoup = calculResistanceEquipement(forceCoup);
        force -= forceCoup;
       // if (force>0) 
       // {
			//parler("Aie");
		//}
       // else
      //  {
        //	equipementEjecte = ejecterEquipement();
        	//parler("j'abandonne...");
       // }
        switch (force) 
        {
        case 0:
             parler("Aïe");
        default:
            equipementEjecte = ejecterEquipement();
            parler("J'abandonne...");
            break;
       }
       // post condition la force a diminuée
	   assert force < oldForce;
	   return equipementEjecte;
	}
	
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte;
        texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
        int resistanceEquipement = 0;
        if ((nbEquipement != 0)) 
        {
        	
             texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
             for (int i = 0; i < nbEquipement-1;i++) 
             {
                  if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)))
                  {
                       resistanceEquipement += 8;
                  } 
                  else 
                  {
                       resistanceEquipement += 5;
                  }
               }
             texte += resistanceEquipement + "!";
          }
        
        parler(texte);
        System.out.println(forceCoup);
        System.out.println(resistanceEquipement);
        forceCoup -= resistanceEquipement;
        System.out.println(forceCoup);
        return forceCoup;
        }
	  
	
	 private Equipement[] ejecterEquipement() 
	 {
        Equipement[] equipementEjecte = new Equipement[nbEquipement]; 
        System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
        int nbEquipementEjecte = 0;
        for (int i = 0; i < nbEquipement; i++)
        {
      	  if (equipements[i] != null) {
                 equipementEjecte[nbEquipementEjecte] = equipements[i];
                nbEquipementEjecte++;
                equipements[i] = null;
           }}
        	return equipementEjecte; }

	/*public static void main(String[] args) 
		{
		    Gaulois asterix=new Gaulois("asterix",8);
			Gaulois Obélix=new Gaulois("Obélix",6);
			System.out.println(asterix.toString());
			asterix.parler("bonjour a tous");
			Romain Minus=new Romain("Minus",6);
			Minus.parler("UN GAUU....UN GAUUGAUU...");
			asterix.frapper(Minus);
			asterix.frapper(Minus);
			asterix.frapper(Minus);
			
			Druide Paromix=new Druide("Paromix",5,10);
			Paromix.parler(" je vais aller preparer une petite potion");
			Paromix.preparerPotion(6);
			Paromix.booster(Obélix);
			Paromix.booster(asterix);
			
			Romain minuse = new Romain("Minuse", 6);
			minuse.sEquiper(Equipement.CASQUE);
			minuse.sEquiper(Equipement.CASQUE);
			minuse.sEquiper(Equipement.BOUCLIER);
			minuse.sEquiper(Equipement.CASQUE);
			
		}
*/

}






