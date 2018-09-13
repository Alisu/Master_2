
public class File extends Stockage {

	String contenu;
	
	public int getBasicSize() {
		return 0;
	}

	@Override
	public Directory getPere() {
		// TODO Auto-generated method stub
		return pere;
	}

	@Override
	public void setPere(Directory pere) {
		// TODO Auto-generated method stub
		this.pere=pere;	
	}
	
	public int size() {
		return basicSize+contenu.length();
	}
	
	public void ls() {
		System.out.println(name);
	}
}
