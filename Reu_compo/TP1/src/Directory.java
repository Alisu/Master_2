import java.util.ArrayList;

public abstract class Directory extends Stockage {
	
	ArrayList<Stockage> contenu = new ArrayList<Stockage>();
	
	public int getBasicSize() {
		return 4;
	}

	public int size() {
		int res=basicSize;
		for(Stockage stock : contenu) {
			res+=stock.size();
		}
		return res;
	}
	
	public void ls() {
		for(Stockage stock : contenu) {
			System.out.println(stock.toString());
		}
	}
	
}
