package creational.prototype;

public class AccountManager {

	public static void main(String[] args) {
		/*
		 * Create Prototypical Objects
		 */
		UserPrototype supervisor = new UserPrototype();
		UserPrototype accountRep = new UserPrototype();
		AccountPrototypeFactory factory = new AccountPrototypeFactory(
				supervisor, accountRep);

		/* Using prototype objects to create other user accounts */
		UserPrototype newSupervisor = factory.getUser("supervisor");
		//customerize user object 

		newSupervisor.setUserName("Russell Jurney");
		newSupervisor.setPassword("pass01");

		//customerize user object 
		UserPrototype anotherSupervisor = factory.getUser("accountRep");
		anotherSupervisor.setUserName("Tom White");
		anotherSupervisor.setPassword("pass02");
		
		System.out.println(newSupervisor);
		System.out.println(anotherSupervisor);

	}
}
