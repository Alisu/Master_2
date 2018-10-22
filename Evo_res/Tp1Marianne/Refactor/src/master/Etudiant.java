
package master;

public class Etudiant {
	
	// attribut à encapsuler
	private Parcours parcours;
	
	public Etudiant() {
		this.setParcours(new Parcours());
	}
	
	public void inscription(String ue) {
		this.getParcours().ues.add("HHMIN357");
		this.getParcours().ues.add("HHMIN358");	
		this.getParcours().ues.add("HHMIN359");	
		this.getParcours().ues.add(ue);	
	}

	public Parcours getParcours() {
		return parcours;
	}

	public void setParcours(Parcours parcours) {
		this.parcours = parcours;
	}
}