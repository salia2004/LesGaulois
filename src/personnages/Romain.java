package personnages;

public class Romain {
	private String nom;
	private int force;
	private String texte;
	private Equipement[]equipements= new Equipement[2];
	private int nbEquipement=0;
	
	public Romain(String nom, int force ) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+ texte +">>");
	}
	
	private String prendreParole() {
		return "le romain " + nom + " : ";
	}
	public void recevoirCoupP(int forceCoup) {
		force-=forceCoup;
		if (force>0) {
			parler("Aie");
		}else {
			parler("j'abandone");
		}}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) 
		{
		case 2:
			{
				System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			}
			break;
		case 1:
			
			if (equipements[0]==equipement)
			{
				System.out.println("Le soldat " + nom + " possede deja un " + equipement.toString());
				break;
			}
		default:
		{
			System.out.println("Le soldat " + nom + " s'equipe avec un  " +  equipement.toString() );
			equipements[nbEquipement]=equipement;
			nbEquipement+=1;
		}
		}
		
		
	}
	public Equipement[] recevoirCoup(int forceCoup) {
        Equipement[] equipementEjecte = null;
        // précondition
        assert force > 0;
        int oldForce = force;
        forceCoup = calculResistanceEquipement(forceCoup);
        force -= forceCoup;
        recevoirCoupP(forceCoup);
        if (force) {
             parler("Aïe");}
          else {
	        equipementEjecte = ejecterEquipement();
	        parler("J'abandonne...");
	   }
	   // post condition la force a diminuée
	   assert force < oldForce;
	   return equipementEjecte;
	}
	
	
	private int calculResistanceEquipement(int forceCoup) {
        texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
        int resistanceEquipement = 0;
        if (nbEquipement != 0) {
             texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
             for (int i = 0; i < nbEquipement;) {
                  if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
                       resistanceEquipement += 8;
                  } else {
                       System.out.println("Equipement casque");
                       resistanceEquipement += 5;
                  }}
             texte += resistanceEquipement + "!";}
        parler(texte);
        forceCoup -= resistanceEquipement;
        return forceCoup;
        }
	  
	
	 private Equipement[] ejecterEquipement() {
         Equipement[] equipementEjecte = new Equipement[nbEquipement]; 
         System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
         //TODO
        int nbEquipementEjecte = 0;
        for (int i = 0; i < nbEquipement; i++) {
      	  if (equipements[i] != null) {
                 equipementEjecte[nbEquipementEjecte] = equipements[i];
                nbEquipementEjecte++;
                equipements[i] = null;
           }}
        	return equipementEjecte; }
	
	
	
	public static void main(String[] args)
	{
		Romain minus = new Romain("Minus",6);
		
		minus.sEquiper(Equipement.CASQUE);
		
		minus.sEquiper(Equipement.CASQUE);
		
		minus.sEquiper(Equipement.BOUCLIER);
		
		minus.sEquiper(Equipement.BOUCLIER);
		
		System.out.println("ok");
		
		
	
		
	}
	
}
