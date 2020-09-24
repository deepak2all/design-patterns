package structural.adapter.socket;

public class GermanPlugConnectorImpl implements  GermanPlugConnector{

	@Override
	public void giveElectricity() {
		System.out.println("Gives electricity using GermanPlugConnector");		
	}

}
