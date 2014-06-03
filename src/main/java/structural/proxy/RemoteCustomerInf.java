package structural.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteCustomerInf extends Remote {
	public void setCardNumber(String cardNumber) throws RemoteException;
	public void setName(String name) throws RemoteException;
	public void saveCustomerData() throws RemoteException;
}
