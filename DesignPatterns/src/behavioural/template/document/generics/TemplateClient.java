package behavioural.template.document.generics;

import java.io.File;

public class TemplateClient {

	public TemplateClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("---- Processing the JSON file -----");
		DocManipulator<JsonDocument> docManipulator = new JsonDocManipulator();
		docManipulator.processFile(new File("..."));
	}

}
