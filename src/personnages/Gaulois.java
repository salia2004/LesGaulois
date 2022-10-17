package personnages;

public class Gaulois {
	private String  nom;
	private int force;
	private int effetPotion = 1 ;
	
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
	
	private String prendreParole() {
		return "le gaulois " + nom + " : ";}
	
	public void frapper(Romain romain) {
		System.out.println(nom +"envoie un grand coup dans la machoire de "+ romain.getNom());
		romain.recevoirCoup(force/3);}
	
	
	
	}

