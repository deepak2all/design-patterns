package behavioural.template.document.generics;

import java.io.File;

public abstract class DocManipulator <T extends Document>{

	public DocManipulator() {
		super();
	}
	
	public void processFile(File file){
		validateChecksum(file);
		T document = parseFile(file);
		updateDocument(document);
		writeUpdatedDocument(document, file.getPath());
	}

	protected abstract T parseFile(File file);
	protected abstract void writeUpdatedDocument(T doc, String path);

	private void updateDocument(Document document) {
		// TODO Auto-generated method stub
		System.out.println("Updating the document");
	}

	private void validateChecksum(File file) {
		// TODO Auto-generated method stub
		System.out.println("Validating the file's checksum");
	}
}
