package structural.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientAccountManager {

	public ClientAccountManager() throws MalformedURLException, RemoteException, NotBoundException {
		String port = "1099";
		String host = "localhost";

		// Call registry for AddOperation
		RemoteCustomerInf remoteObj = (RemoteCustomerInf) Naming
				.lookup("rmi://" + host + ":" + port + "/RemoteCustomer");

		//proxy methods call
		System.out.println("calling remote customer through proxy.");
		remoteObj.setName("John");
		remoteObj.setCardNumber("0000-4111-1515-5165");
		remoteObj.saveCustomerData();
	}

	
	public static void main(String[] args){
		try {
			new ClientAccountManager();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
}
