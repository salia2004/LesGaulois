package personnages;

public class Musee {
    private Equipement trophees[] = new Equipement[200];
    private int nbTrophee;
   
    public Musee ()
    {
                  nbTrophee=0;
    }
   
    public void donnerTrophees(Gaulois gaulois, Equipement equipement)
    {
        this.trophees[nbTrophee]=equipement;
        nbTrophee++;
    }

}

