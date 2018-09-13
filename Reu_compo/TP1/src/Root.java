
public class Root extends Directory{
  
	static int compteur = 0;
	
	Root(){
		if(compteur!=0) {
			System.out.println("Root existe déjà");
			System.exit(1);
		}else
		{
			name="/";
			pere = null;
		}
	}

	@Override
	public Directory getPere() {
		// TODO Auto-generated method stub
		System.out.println("Root n'a pas de parent, renvoie de Root");
		return this;
	}

	@Override
	public void setPere(Directory pere) {
		// TODO Auto-generated method stub
		System.out.println("Root ne peut avoir de parent");
	}	
}
