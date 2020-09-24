package structural.adapter.socket;

public class GermanToUKPlugConnectorAdapter implements UKPlugConnector {

	private GermanPlugConnector gPlug;
	
	public GermanToUKPlugConnectorAdapter(GermanPlugConnector gPlug){
		this.gPlug = gPlug;
	}
	
	@Override
	public void provideElectricity() {
		gPlug.giveElectricity();
	}

}
