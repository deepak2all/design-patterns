package structural.adapter.boat.row;

public class Client {

	public static void main(String[] args) {
		Captain captain = new Captain();
		captain.setRowing(new BoatAdapter());
		captain.doRowing("Rowing boat");
	}

}
