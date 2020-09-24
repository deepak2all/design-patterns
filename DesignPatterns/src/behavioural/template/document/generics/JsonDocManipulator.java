package behavioural.template.document.generics;

import java.io.File;

public class JsonDocManipulator extends DocManipulator<JsonDocument> {

	public JsonDocManipulator() {
		// TODO Auto-generated constructor stub
		super();
	}


	@Override
	protected void writeUpdatedDocument(JsonDocument doc, String path) {
		// TODO Auto-generated method stub
		System.out.println("Writing JSON Document");
	}


	@Override
	protected JsonDocument parseFile(File file) {
		// TODO Auto-generated method stub
		System.out.println("Parsing file as JSON Document");
		return new JsonDocument();
	}

}
