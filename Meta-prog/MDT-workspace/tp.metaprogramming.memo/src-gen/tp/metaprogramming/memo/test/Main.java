package tp.metaprogramming.memo.test;

import tp.metaprogramming.memo.Automobile;
import tp.metaprogramming.memo.AutomobileType;
import tp.metaprogramming.memo.MemoFactory;
import tp.metaprogramming.memo.Person;
import tp.metaprogramming.memo.World;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World w = MemoFactory.eINSTANCE.createWorld();
		
		Automobile a = MemoFactory.eINSTANCE.createAutomobile();
		a.setTypeVoiture(AutomobileType.MERCEDES);;
		a.setName("Class C");
		w.getAutomobiles().add(a);
		
		Person p = MemoFactory.eINSTANCE.createPerson();
		p.setName("Paul");
		p.setAge(45);
		p.getHas().add(a);
		w.getPopulation().add(p);
		
		System.out.println(p.getAge());
		p.birthday();
		System.out.println(p.getAge());
		
	}

}
