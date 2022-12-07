package exam.session2.exercice3;
public class DossierVehicule extends Dossier{
	private int nbChevaux;
	private char categorie;
	public int getNbChevaux() {
		return nbChevaux;
	}
	public void setNbChevaux(int nbChevaux) {
		this.nbChevaux = nbChevaux;
	}
	public char getCategorie() {
		return categorie;
	}
	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}
	public DossierVehicule(long id, int nbChevaux, char categorie) {
		this.nbChevaux = nbChevaux;
		this.categorie = categorie;
		calculerMontant();	
	}
	@Override
	protected void calculerMontant() {
		if (categorie=='E')
		{
			if (nbChevaux<8) {
				montant=350;
			}
			if (nbChevaux>=8 && nbChevaux<10) {
				montant=650;
			}
			if (nbChevaux>=11 && nbChevaux<14) {
				montant=3000;
			}
			if (nbChevaux>=15) {
				montant=8000;
			}
		}
		if (categorie=='G')
		{
			if (nbChevaux<8) {
				montant=700;
			}
			if (nbChevaux>=8 && nbChevaux<10) {
				montant=1500;
			}
			if (nbChevaux>=11 && nbChevaux<14) {
				montant=6000;
			}
			if (nbChevaux>=15) {
				montant=20000;
			}
		}		
	}
	@Override
	public String toString() {	
		return "Vehicule "+ categorie +" "+ nbChevaux+" CH, montant:  "+montant;
	}
}
