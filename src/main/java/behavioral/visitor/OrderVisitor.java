package behavioral.visitor;

public class OrderVisitor implements VisitorInterface {
	private double totAmount;
	
	public OrderVisitor() {
		totAmount = 0;
	}
	
	//going to visit all the orders in the collection
	@Override public void visit(OrderInterface o) {
		totAmount += o.getAmount();
		System.out.println(o.toString());
	}

	public double getTotAmount() {
		return totAmount;
	}
}
