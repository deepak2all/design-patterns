package creational.abstractt.factory.television;

import java.util.List;

public interface TelevisionPartsFactory {
	int createBoard();
	int createButton();
	List<String> createSpecialFeatures();
}
