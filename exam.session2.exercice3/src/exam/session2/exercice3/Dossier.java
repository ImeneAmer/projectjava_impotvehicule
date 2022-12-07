package exam.session2.exercice3;
public abstract class Dossier {
	private long id;
	protected double montant;
	private Impots impots;
	abstract protected void calculerMontant();
	public Impots getImpots() {	
		return impots;
	}
	public void setImpots(Impots impots) {
		this.impots = impots;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	


	

	
	
	

}
