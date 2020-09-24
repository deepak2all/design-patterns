package behavioural.template.document;

import java.io.File;

public class TemplateClient {

	public TemplateClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("---- Processing the XML file -----");
		DocManipulator docManipulator = new XmlDocManipulator();
		docManipulator.processFile(new File("..."));
		System.out.println();
		System.out.println("---- Processing the JSON file -----");
		docManipulator = new JsonDocManipulator();
		docManipulator.processFile(new File("..."));
	}

}
