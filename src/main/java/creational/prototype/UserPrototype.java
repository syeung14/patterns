package creational.prototype;
import java.util.Vector;


public class UserPrototype implements Cloneable {

	private String userName;
	private String password;
	private Vector<String> otherData = new Vector<String>();

	public void setUserName(String uName) {
		userName = uName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String pwd) {
		password = pwd;
	}
	public String getPassword() {
		return password;
	}
	public void setOtherData(Vector<String> data) {
		this.otherData = data;
	}
	public Object clone() {
		//Deep copy
		UserPrototype account=new UserPrototype();
		account.setUserName(this.getUserName());
		account.setPassword(this.getPassword());
		Vector<String> nData = new Vector<String>();
		account.setOtherData(nData);
		
		//return the copy object
		for (String elem : otherData) {
			nData.add(elem);
		}
		
		//Shallow Copy
		/*try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}*/

		return account;
	}

	@Override
	public String toString() {
		return userName + ", " + password;
	}
}
