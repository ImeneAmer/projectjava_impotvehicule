package exam.session2.exercice3;
public class DossierRevenus extends Dossier{
	private double ca;// chiffre d'affaire 
	public DossierRevenus(long id, double ca) {
		//id=id;
		this.ca = ca;
		calculerMontant();	
	}
	public double getCa() {
		return ca;
	}
	public void setCa(double ca) {
		this.ca = ca;
	}
	@Override
	protected void calculerMontant() {
		montant=ca*0.15;	
	}
	@Override
	public String toString() {
		return " 15% de revenus "+ca+",  Montant "+montant;
	}
}
