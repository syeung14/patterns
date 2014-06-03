package creational.prototype;

public class AccountPrototypeFactory {

	private UserPrototype accountRep;
	private UserPrototype supervisor;

	public AccountPrototypeFactory(UserPrototype supervisorAccount,
			UserPrototype arep) {
		accountRep = arep;
		supervisor = supervisorAccount;
	}

	public UserPrototype getUser(String type) {
		//return prototype object with cloning
		if ("accountRep".equalsIgnoreCase(type)) {
			System.out.println("create account rep. with prototype");
			return (UserPrototype) accountRep.clone();

		} else if ("supervisor".equalsIgnoreCase(type)) {
			System.out.println("create supervisor with prototype");
			return (UserPrototype) supervisor.clone();
		}
		return null;
	}

	public UserBlogPrototype getUserBlog(String type) {
		return null;
		// not implemented
	}

}
