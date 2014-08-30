package behavioral.visitor;

public interface OrderInterface {
	public void accept(VisitorInterface ov);
	public double getAmount();
}
