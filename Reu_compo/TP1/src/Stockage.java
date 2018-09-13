
public abstract class Stockage {
	
	String name;
	Directory pere;
	int basicSize=getBasicSize();
	
	public abstract Directory getPere();
	
	public abstract void setPere(Directory pere);
	
	public abstract int getBasicSize();
	
	public void setBasicSize(int basicSize) {
		this.basicSize = basicSize;
	}
	
	public abstract int size();
	
	public String getAbsoluteAdresse() {
		return pere.getAbsoluteAdresse()+("/")+name;
	}
	
	public abstract void ls();

	@Override
	public String toString() {
		return name;
	}	
	
}
