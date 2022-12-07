package exam.session2.exercice3;
import java.util.ArrayList;
import java.util.List;
public class Impots {	
	private int annee; 
	private double totalImpot;
	private List<Dossier> dossier=new ArrayList<>();
	private Societe societe;
	public Societe getSociete() {
		return societe;
	}
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	public List<Dossier> getDossier() {	
		return dossier;	
	}
	public void setDossier(List<Dossier> dossier) {
		
		this.dossier = dossier;	
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double getTotalImpot() {	
		return totalImpot;
	}
	public void setTotalImpot(double totalImpot) {
		this.totalImpot = totalImpot;
	}
	public Impots(int annee) {
		this.annee = annee;		
	}
    public void add (Dossier d) {
    	
		dossier.add(d);	
	}
    @Override
    public String toString() {
    	String detail="List des impots "+getAnnee()+"\n";
    	
    	for(Dossier d:dossier) {
    		
    		detail+=d+"\n";
    		totalImpot+=d.montant;
    	}
    
    	return " \n" + detail+ "Total: "+totalImpot;
    }
}
