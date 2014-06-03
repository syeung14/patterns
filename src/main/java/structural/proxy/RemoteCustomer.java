package structural.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteCustomer extends UnicastRemoteObject implements RemoteCustomerInf {
	private String cardNumber;
	private String name;

	public RemoteCustomer() throws RemoteException {
	}

	@Override
	public void setCardNumber(String cardNumber) throws RemoteException {
		this.cardNumber = cardNumber;
	}

	@Override
	public void setName(String name) throws RemoteException {
		this.name = name;
	}

	@Override
	public void saveCustomerData() throws RemoteException {
		System.out.println("cust data saved. " + this.name + ", " + cardNumber);
	}

	/*
	 * %java_home%\bin\rmic structural.proxy.RemoteCustomer
	 * rmiregistry
	 * java RemoteCustomer
	 * java ClientAccountManager
	 * 
	 */
	public static void main(String[] args) throws Exception {
		String port = "1099";
		String host = "localhost";

		// Create an instance of the server
		RemoteCustomer facade = new RemoteCustomer();

		// Bind it with the RMI Registry
		Naming.bind("//" + host + ":" + port + "/RemoteCustomer", facade);

		System.out.println("Service Bound...");

	}
}
