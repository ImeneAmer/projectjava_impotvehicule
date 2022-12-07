package exam.session2.exercice3;
import java.util.ArrayList;
import java.util.List;
public class Societe {
	private long id; 
	private String raison_social;
	private List<Impots> impots=new ArrayList<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRaison_social() {
		return raison_social;
	}
	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
	}
	public Societe(long id, String raison_social) {
		
		this.id = id;
		this.raison_social = raison_social;	
	}
	@Override
	public String toString() {
		
		return "Societe "+id+" - "+raison_social+"\n";
	}
	public List<Impots> getImpots() {
		return impots;
	}
	public List<Impots> getImpots(int annee) {	
		
		for (Impots imp2 : impots) {
			if (annee==imp2.getAnnee()) { 
			  impots=getImpots();     
			}
			else {
				impots=null;
				System.out.println("Aucun impot n'est enregitre pour cette date ");
			}
		
	} 
		return impots;
	}
	public void setImpots(List<Impots> impots) {
		this.impots = impots;
	}
	public void add (Impots imp) {	
		impots.add(imp);
	}
}
