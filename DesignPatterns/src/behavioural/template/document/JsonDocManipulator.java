package behavioural.template.document;

import java.io.File;

public class JsonDocManipulator extends DocManipulator {

	public JsonDocManipulator() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	protected Document parseFile(File file) {
		// TODO Auto-generated method stub
		System.out.println("Parsing file as JSON Document");
		return new JsonDocument();
	}

	@Override
	protected void writeUpdatedDocument(Document doc, String path) {
		// TODO Auto-generated method stub
		System.out.println("Writing JSON Document");
	}

}
