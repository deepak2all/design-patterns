package structural.adapter.boat.row;

public class Captain {

	private Rowing rowing;
	  
	public Rowing getRowing() {
		return rowing;
	}

	public void setRowing(Rowing rowing) {
		this.rowing = rowing;
	}

	public void doRowing(String s) {
		 //System.out.println("The Rowing boat is rowing");
		 rowing.row(s);
	}
}
