package behavioural.template.document;

import java.io.File;

public abstract class DocManipulator {

	public DocManipulator() {
		super();
	}
	
	public void processFile(File file){
		validateChecksum(file);
		Document document = parseFile(file);
		updateDocument(document);
		writeUpdatedDocument(document, file.getPath());
	}

	protected abstract Document parseFile(File file);
	protected abstract void writeUpdatedDocument(Document doc, String path);

	private void updateDocument(Document document) {
		// TODO Auto-generated method stub
		System.out.println("Updating the document");
	}

	private void validateChecksum(File file) {
		// TODO Auto-generated method stub
		System.out.println("Validating the file's checksum");
	}
}
