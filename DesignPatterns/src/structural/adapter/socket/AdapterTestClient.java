package structural.adapter.socket;

public class AdapterTestClient {

	public static void main(String[] args) {
		GermanPlugConnector gPlugConnector = new GermanPlugConnectorImpl();
		UKElectricalSocket ukElectricalSocket = new UKElectricalSocket();
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(gPlugConnector);
		ukElectricalSocket.ukPlugin(ukAdapter);
	}

}
