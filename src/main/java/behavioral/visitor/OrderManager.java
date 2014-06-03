package behavioral.visitor;

public class OrderManager {

	public OrderManager() {
	}
	
	private void processOrder() {
		
		//create visitor
		OrderVisitor objVisitor = new OrderVisitor();
		
		//create order collection
		OrderInterface orderVA = new VAOrder("VA order", 1000);
		orderVA.accept(objVisitor);  //processed by visitor
		OrderInterface orderDC = new DCOrder("DC order", 2000);
		orderDC.accept(objVisitor);  //processed by visitor
		
		//visitor visited all the orders
		System.out.println("Total amount: "+ objVisitor.getTotAmount());
		
	}
	
	public static void main(String[] args) {
		OrderManager om = new OrderManager();
		om.processOrder();
	}
}
