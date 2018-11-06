package memo.test;

import java.io.ObjectInputStream.GetField;

import memo.*;

public class Main {
	public static void main(String[] args) {
		World w = MemoFactory.eINSTANCE.createWorld();
		
		Automible a = MemoFactory.eINSTANCE.createAutomible();
		a.setType(AutomobileType.MERCEDES);
		a.setName("Class C");
		
		
		Person p = MemoFactory.eINSTANCE.createPerson();
		p.setName("Croutchevre");
		p.setAge(45);
		p.getHas().add(a);
		
		w.getAutomibles().add(a);
		w.getPopulation().add(p);
		
		System.out.println(p.getAge());
		p.birthday();
		System.out.println(p.getAge());
		
	}
}
