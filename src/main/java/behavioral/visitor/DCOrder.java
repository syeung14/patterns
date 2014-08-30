package behavioral.visitor;

public class DCOrder implements OrderInterface {
	private String type;
	private double orderAmount;
	
	public DCOrder(String type, double amount) {
		this.type = type;
		this.orderAmount = amount;
	}
	@Override public String toString() {
		return type + "," + orderAmount;
	}
	@Override public double getAmount() {
		return orderAmount;
	}
	@Override public void accept(VisitorInterface ov) {
		ov.visit(this);

	}

}
