package behavioral.visitor;

public class OrderManager {
	public OrderManager() {}
	
	private void processOrder() {
		
		//create visitor, 
		//perfrom operation on a collection of orders
		OrderVisitor objVisitor = new OrderVisitor();
		
		//create order collection
		OrderInterface orders[] = {null,null};
		orders[0] = new VAOrder("VA order", 1000);
		orders[1] = new DCOrder("DC order", 2000);
		
		//processed by visitor
		for (int i = 0; i < 2; i++) {
			orders[i].accept(objVisitor);  
		}
		
		//visitor has the data 
		System.out.println("Total amount: "
		           + objVisitor.getTotAmount());
		
	}
	
	public static void main(String[] args) {
		OrderManager om = new OrderManager();
		om.processOrder();
	}
}
