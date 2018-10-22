package master;

import java.util.*;

public class Parcours {
	
	public List<String> ues = new LinkedList<String>();
	
	public static void main(String[] a){
		Etudiant e = new Etudiant();
		e.setParcours(new Parcours());
		System.out.println("test");
	}
}